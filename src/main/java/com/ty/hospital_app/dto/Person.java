package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	private String personName;
	private long personPhone;
	private String email;
	@OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
	private List<Encounter>encounter;
	
	public List<Encounter> getEncounter() {
		return encounter;
	}

	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personPhone=" + personPhone
				+ ", email=" + email + ", encounter=" + encounter + "]";
	}
}
