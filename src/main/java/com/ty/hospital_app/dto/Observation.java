package com.ty.hospital_app.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Observation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int observationId;
	private LocalDateTime dateTime;
	private String status;
	private String remarks;
    @ManyToOne
    @JoinColumn(name = "encounter_id")
    private Encounter encounter;
	public int getObservationId() {
		return observationId;
	}
	public void setObservationId(int observationId) {
		this.observationId = observationId;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	@Override
	public String toString() {
		return "Observation [observationId=" + observationId + ", dateTime=" + dateTime + ", status=" + status
				+ ", remarks=" + remarks + ", encounter=" + encounter + "]";
	}
}
