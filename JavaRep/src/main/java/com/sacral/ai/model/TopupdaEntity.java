package com.sacral.ai.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topupda_temp")
public class TopupdaEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long topupId;
    private String topupStatus;
    private String amountStatus;
    private Date modifiedOn;
    
    public Long getTopupId() {
        return topupId;
    }
    public void setTopupId(Long topupId) {
        this.topupId = topupId;
    }
    public String getTopupStatus() {
        return topupStatus;
    }
    public void setTopupStatus(String topupStatus) {
        this.topupStatus = topupStatus;
    }
    public String getAmountStatus() {
        return amountStatus;
    }
    public void setAmountStatus(String amountStatus) {
        this.amountStatus = amountStatus;
    }
    public Date getModifiedOn() {
        return modifiedOn;
    }
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
}