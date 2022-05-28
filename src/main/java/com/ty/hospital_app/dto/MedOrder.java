package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medOrderId;
	@ManyToOne
	private Encounter encounter;
	private String perscription;
	@OneToMany
	private List<Item> items;
	private double total;

	public int getMedOrderId() {
		return medOrderId;
	}

	public void setMedOrderId(int medOrderId) {
		this.medOrderId = medOrderId;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	public String getPerscription() {
		return perscription;
	}

	public void setPerscription(String perscription) {
		this.perscription = perscription;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
