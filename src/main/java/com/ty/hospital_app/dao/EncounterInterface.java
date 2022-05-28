package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterInterface {

	public abstract Encounter saveEncounter(Encounter encounter, int branchId, int personId);

	public abstract List<Encounter> getAllEncounterByPersonId(int personId);

	public abstract Encounter getEncounterById(int branchId, int encounterId, int personId);

	public abstract boolean deleteEncounterById(int branchId, int encounterId, int personId);

	public abstract Encounter updateEncounterById(int branchId, int encounterId, int personId, Encounter encounter);

}
