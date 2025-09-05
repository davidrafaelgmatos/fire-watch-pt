package com.firewatch.backend.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class IncidentDateTimeDto {
    private Long sec;

    public IncidentDateTimeDto() {}

    @JsonCreator
    public IncidentDateTimeDto(Long sec) {
        this.sec = sec;
    }

    @JsonValue
    public Long toValue() {
        return sec;
    }

    public Long getSec() {
        return sec;
    }

    public void setSec(Long sec) {
        this.sec = sec;
    }
}