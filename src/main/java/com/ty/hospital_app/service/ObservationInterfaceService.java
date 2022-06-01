package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationInterfaceService {

	public abstract Observation saveObservation(Observation observation, int personId, int encounterId);

	public abstract Observation getObservationById(int observationId);

	public abstract boolean removeObservation(int observationId);

	public abstract List<Observation> getAllObservations(int encounterId);
}
