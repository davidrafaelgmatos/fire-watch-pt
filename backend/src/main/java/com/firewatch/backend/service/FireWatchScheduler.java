package com.firewatch.backend.service;

import com.firewatch.backend.dto.IncidentDto;
import com.firewatch.backend.dto.IncidentStatusDto;
import com.firewatch.backend.model.Incident;
import com.firewatch.backend.model.Status;
import com.firewatch.backend.repository.IncidentRepository;
import com.firewatch.backend.repository.IncidentStatusRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class FireWatchScheduler {

    private final IncidentRepository incidentRepository;
    private final IncidentStatusRepository incidentStatusRepository;
    private final TelegramService telegramService;
    private final FireWatchService fireWatchService;

    public FireWatchScheduler(
            IncidentRepository incidentRepository,
            IncidentStatusRepository incidentStatusRepository,
            TelegramService telegramService,
            FireWatchService fireWatchService
    ) {
        this.incidentRepository = incidentRepository;
        this.incidentStatusRepository = incidentStatusRepository;
        this.telegramService = telegramService;
        this.fireWatchService = fireWatchService;
    }

    @Scheduled(fixedRate = 300000)
    public void fetchIncidents(){
        try{
            ArrayList<IncidentDto> incidents = fireWatchService.GetIncidentList();
            if(incidents == null) return;
            for(IncidentDto incident : incidents){
                processIncident(incident);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void processIncident(IncidentDto incident){
        String proCivId = incident.getId();
        Optional<Incident> db = incidentRepository.findByProCivId(proCivId);

        if(db.isPresent()){
            Incident dbMessage = db.get();
            processExistingIncident(dbMessage);
        }else{
            processNewIncident(incident, proCivId);
        }
    }

    private void processNewIncident(IncidentDto incident, String proCivId){
        Incident newIncident = new Incident(proCivId, incident.getLocation(), incident.getDistrict(), incident.getConcelho(), incident.getFreguesia(), incident.getRegiao(), incident.getDate(), incident.getHour(), incident.getCreated().getSec(), incident.getUpdated().getSec(), "temp_id");
        String telegramMessageId = telegramService.sendMessage("test message");
        newIncident.setTelegramMessageId(telegramMessageId);
        incidentRepository.save(newIncident);
        processNewIncidentStatus(incident, newIncident);
    }

    private void processExistingIncident(Incident incident){
        try{
            long messageId = Long.parseLong(incident.getTelegramMessageId());
            telegramService.editMessage(messageId, "Edited Text");
        }catch (Exception e){
            throw new RuntimeException("Not able to edit message");
        }
    }

    private void processNewIncidentStatus(IncidentDto incident, Incident newIncident){
        ArrayList<IncidentStatusDto> newIncidentStatus = fireWatchService.GetIncidentDetails(newIncident.getProCivId());
        if(newIncidentStatus == null) return;
        ArrayList<Status> newStatus = new ArrayList<>();
        for(IncidentStatusDto incidentStatus : newIncidentStatus){
            Status initialStatus = new Status(incidentStatus.getStatus(), incidentStatus.getCreated().getSec(), incident.getTerrain(), incident.getAerial(), incident.getMan(), newIncident);
            newStatus.add(initialStatus);
        }
        incidentStatusRepository.saveAll(newStatus);
    }
}
