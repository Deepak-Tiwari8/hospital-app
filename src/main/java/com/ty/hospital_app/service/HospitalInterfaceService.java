package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalInterfaceService {

	public abstract Hospital saveHospital(Hospital hospital);

	public abstract Hospital getHospitalById(int hospitalIdId);

	public abstract Hospital updateHospitalById(int hospitalId, Hospital hospital);

	public abstract boolean deleteHospitalById(int hospitalId);
}
