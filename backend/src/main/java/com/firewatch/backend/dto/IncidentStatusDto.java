package com.firewatch.backend.dto;

import jakarta.annotation.Nullable;

public class IncidentStatusDto {
    String id;
    Long sharepointId;
    String location;
    String status;
    Long statusCode;
    String label;
    IncidentDateTimeDto created;
    IncidentDateTimeDto updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSharepointId() {
        return sharepointId;
    }

    public void setSharepointId(Long sharepointId) {
        this.sharepointId = sharepointId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
