package com.firewatch.backend.dto;

import java.util.ArrayList;

public class ProCivStatusResponse {
  Boolean success;
  ArrayList<IncidentStatusDto> data;

    public ArrayList<IncidentStatusDto> getData() {
        return data;
    }

    public void setData(ArrayList<IncidentStatusDto> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
