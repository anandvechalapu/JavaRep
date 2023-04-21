package com.sacral.ai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TopupdaTempModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long topupId;
    private String topupName;
    private String topupType;
    private String topupStatus;
    private String topupAmount;
    
    public Long getTopupId() {
		return topupId;
	}
	public void setTopupId(Long topupId) {
		this.topupId = topupId;
	}
	public String getTopupName() {
		return topupName;
	}
	public void setTopupName(String topupName) {
		this.topupName = topupName;
	}
	public String getTopupType() {
		return topupType;
	}
	public void setTopupType(String topupType) {
		this.topupType = topupType;
	}
	public String getTopupStatus() {
		return topupStatus;
	}
	public void setTopupStatus(String topupStatus) {
		this.topupStatus = topupStatus;
	}
	public String getTopupAmount() {
		return topupAmount;
	}
	public void setTopupAmount(String topupAmount) {
		this.topupAmount = topupAmount;
	}
}