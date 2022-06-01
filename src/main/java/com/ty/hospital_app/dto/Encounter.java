package com.ty.hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int encounterId;
	private LocalDateTime admitDateAndTime;
	private LocalDateTime disChargeDateAndTime;
	private String reason;
    @ManyToOne
    @JoinColumn
	private Person person;
    @ManyToOne
    @JoinColumn
	private Branch branch;
	@OneToMany(mappedBy = "encounter")
	private List<MedOrder> medOrder;
	@OneToMany(mappedBy = "en")
	private List<Observation> observations;
	public int getEncounterId() {
		return encounterId;
	}
	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}
	public LocalDateTime getAdmitDateAndTime() {
		return admitDateAndTime;
	}
	public void setAdmitDateAndTime(LocalDateTime admitDateAndTime) {
		this.admitDateAndTime = admitDateAndTime;
	}
	public LocalDateTime getDisChargeDateAndTime() {
		return disChargeDateAndTime;
	}
	public void setDisChargeDateAndTime(LocalDateTime disChargeDateAndTime) {
		this.disChargeDateAndTime = disChargeDateAndTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<MedOrder> getMedOrder() {
		return medOrder;
	}
	public void setMedOrder(List<MedOrder> medOrder) {
		this.medOrder = medOrder;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
}
