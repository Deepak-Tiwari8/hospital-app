package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String hospitalId;
	private String hospitalName;
	private String hospitalWebsite;
	@OneToMany
	private List<Branch> hospitalbranch;

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalWebsite() {
		return hospitalWebsite;
	}

	public void setHospitalWebsite(String hospitalWebsite) {
		this.hospitalWebsite = hospitalWebsite;
	}

	public List<Branch> getBranch() {
		return hospitalbranch;
	}

	public void setBranch(List<Branch> hospitalbranch) {
		this.hospitalbranch = hospitalbranch;
	}
}
