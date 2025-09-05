package com.firewatch.backend.service;

import com.firewatch.backend.dto.IncidentDto;
import com.firewatch.backend.dto.IncidentStatusDto;
import com.firewatch.backend.dto.ProCivResponse;
import com.firewatch.backend.dto.ProCivStatusResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class FireWatchService {

    private final RestTemplate restTemplate;

    public FireWatchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ArrayList<IncidentDto> GetIncidentList() {
        String url = "https://api.fogos.pt/new/fires";
        ProCivResponse response = restTemplate.getForObject(url, ProCivResponse.class);
        return response == null || response.getData().isEmpty() ? new ArrayList<IncidentDto>() : response.getData();
    }

    public ArrayList<IncidentStatusDto> GetIncidentDetails(String incidentId) {
        String url = "https://api.fogos.pt/fires/status?id=" + incidentId;
        ProCivStatusResponse response = restTemplate.getForObject(url, ProCivStatusResponse.class);
        return response == null || response.getData().isEmpty() ? new ArrayList<IncidentStatusDto>() : response.getData();
    }
}
