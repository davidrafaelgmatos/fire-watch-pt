package com.firewatch.backend.dto;

import java.time.LocalDateTime;

public class IncidentDto {
    String id;
    Boolean coords;
    IncidentDateTimeDto dateTime;
    String date;
    String hour;
    String location;
    String detailLocation;
    Integer aerial;
    Integer terrain;
    Integer man;
    Integer meios_aquaticos;
    Integer heliFight;
    Integer planeFight;
    Integer heliCoord;
    String especieName;
    String familiaName;
    String district;
    String concelho;
    String dico;
    String freguesia;
    Long lat;
    Long lng;
    String pco;
    String cos;
    Long naturezaCode;
    String natureza;
    Long statusCode;
    String statusColor;
    String status;
    Boolean important;
    Boolean active;
    String sadoId;
    Long sharepointId;
    String extra;
    Boolean disappear;
    String regiao;
    String subRegiao;
    String kml;
    String kmlVost;
    IncidentDateTimeDto created;
    IncidentDateTimeDto updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getCoords() {
        return coords;
    }

    public void setCoords(Boolean coords) {
        this.coords = coords;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public IncidentDateTimeDto getDateTime() {
        return dateTime;
    }

    public void setDateTime(IncidentDateTimeDto dateTime) {
        this.dateTime = dateTime;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetailLocation() {
        return detailLocation;
    }

    public void setDetailLocation(String detailLocation) {
        this.detailLocation = detailLocation;
    }

    public Integer getAerial() {
        return aerial;
    }

    public void setAerial(Integer aerial) {
        this.aerial = aerial;
    }

    public Integer getTerrain() {
        return terrain;
    }

    public void setTerrain(Integer terrain) {
        this.terrain = terrain;
    }

    public Integer getMan() {
        return man;
    }

    public void setMan(Integer man) {
        this.man = man;
    }

    public Integer getMeios_aquaticos() {
        return meios_aquaticos;
    }

    public void setMeios_aquaticos(Integer meios_aquaticos) {
        this.meios_aquaticos = meios_aquaticos;
    }

    public Integer getHeliFight() {
        return heliFight;
    }

    public void setHeliFight(Integer heliFight) {
        this.heliFight = heliFight;
    }

    public Integer getPlaneFight() {
        return planeFight;
    }

    public void setPlaneFight(Integer planeFight) {
        this.planeFight = planeFight;
    }

    public Integer getHeliCoord() {
        return heliCoord;
    }

    public void setHeliCoord(Integer heliCoord) {
        this.heliCoord = heliCoord;
    }

    public String getEspecieName() {
        return especieName;
    }

    public void setEspecieName(String especieName) {
        this.especieName = especieName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getFamiliaName() {
        return familiaName;
    }

    public void setFamiliaName(String familiaName) {
        this.familiaName = familiaName;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getDico() {
        return dico;
    }

    public void setDico(String dico) {
        this.dico = dico;
    }

    public String getFreguesia() {
        return freguesia;
    }

    public void setFreguesia(String freguesia) {
        this.freguesia = freguesia;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLng() {
        return lng;
    }

    public void setLng(Long lng) {
        this.lng = lng;
    }

    public String getPco() {
        return pco;
    }

    public void setPco(String pco) {
        this.pco = pco;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public Long getNaturezaCode() {
        return naturezaCode;
    }

    public void setNaturezaCode(Long naturezaCode) {
        this.naturezaCode = naturezaCode;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusColor() {
        return statusColor;
    }

    public void setStatusColor(String statusColor) {
        this.statusColor = statusColor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getImportant() {
        return important;
    }

    public void setImportant(Boolean important) {
        this.important = important;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSadoId() {
        return sadoId;
    }

    public void setSadoId(String sadoId) {
        this.sadoId = sadoId;
    }

    public Long getSharepointId() {
        return sharepointId;
    }

    public void setSharepointId(Long sharepointId) {
        this.sharepointId = sharepointId;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Boolean getDisappear() {
        return disappear;
    }

    public void setDisappear(Boolean disappear) {
        this.disappear = disappear;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSubRegiao() {
        return subRegiao;
    }

    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    public String getKml() {
        return kml;
    }

    public void setKml(String kml) {
        this.kml = kml;
    }

    public String getKmlVost() {
        return kmlVost;
    }

    public void setKmlVost(String kmlVost) {
        this.kmlVost = kmlVost;
    }

    public IncidentDateTimeDto getCreated() {
        return created;
    }

    public void setCreated(IncidentDateTimeDto created) {
        this.created = created;
    }

    public IncidentDateTimeDto getUpdated() {
        return updated;
    }

    public void setUpdated(IncidentDateTimeDto updated) {
        this.updated = updated;
    }
}
