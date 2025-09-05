package com.firewatch.backend.dto;

import java.util.ArrayList;

public class ProCivResponse {
  Boolean success;
  ArrayList<IncidentDto> data;

    public ArrayList<IncidentDto> getData() {
        return data;
    }

    public void setData(ArrayList<IncidentDto> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
