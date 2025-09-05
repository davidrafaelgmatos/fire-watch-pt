package com.firewatch.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "incident_status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String status;
    private Integer dispatchedVehicles;
    private Integer dispatchedAerials;
    private Integer dispatchedPersonnel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "incident_id", nullable = false)
    private Incident incident;

    private Long createdAt;
    // Constructors
    public Status() {
    }

    public Status(String status, Long createAt, Integer dispatchedVehicles, Integer dispatchedAerials, Integer dispatchedPersonnel, Incident incident) {
        this.status = status;
        this.dispatchedAerials = dispatchedAerials != null ? dispatchedAerials : 0;
        this.dispatchedVehicles = dispatchedVehicles != null ? dispatchedVehicles : 0;
        this.dispatchedPersonnel = dispatchedPersonnel != null ? dispatchedPersonnel : 0;
        this.createdAt = createAt;
        this.incident = incident;
    }

    // Getters and Setters
    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDispatchedVehicles() {
        return dispatchedVehicles;
    }

    public void setDispatchedVehicles(Integer dispatchedVehicles) {
        this.dispatchedVehicles = dispatchedVehicles;
    }

    public Integer getDispatchedAerials() {
        return dispatchedAerials;
    }

    public void setDispatchedAerials(Integer dispatchedAerials) {
        this.dispatchedAerials = dispatchedAerials;
    }

    public Integer getDispatchedPersonnel() {
        return dispatchedPersonnel;
    }

    public void setDispatchedPersonnel(Integer dispatchedPersonnel) {
        this.dispatchedPersonnel = dispatchedPersonnel;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }
}
