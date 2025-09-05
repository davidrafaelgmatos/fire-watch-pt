package com.firewatch.backend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "incident")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String proCivId;

    private String title;
    private String district;
    private String concelho;
    private String freguesia;
    private String regiao;

    private String date;
    private String hour;

    private Long createdAt;
    private Long updatedAt;


    @OneToMany(mappedBy = "incident", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Status> status;

    private String telegramMessageId;

    public Incident() {
    }

    public Incident(String proCivId, String title, String district, String concelho, String freguesia, String regiao, String date, String hour, Long createdAt, Long updatedAt, String telegramMessageId) {
        this.proCivId = proCivId;
        this.title = title;
        this.district = district;
        this.concelho = concelho;
        this.freguesia = freguesia;
        this.regiao = regiao;
        this.date = date;
        this.hour = hour;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.telegramMessageId = telegramMessageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProCivId() {
        return proCivId;
    }

    public void setProCivId(String proCivId) {
        this.proCivId = proCivId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public String getTelegramMessageId() {
        return telegramMessageId;
    }

    public void setTelegramMessageId(String telegramMessageId) {
        this.telegramMessageId = telegramMessageId;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getFreguesia() {
        return freguesia;
    }

    public void setFreguesia(String freguesia) {
        this.freguesia = freguesia;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
