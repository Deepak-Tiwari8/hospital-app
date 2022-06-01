package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalInterfaceDao {

	public abstract Hospital saveHospital(Hospital hospital);

	public abstract Hospital getHospitalById(int hospitalIdId);

	public abstract Hospital updateHospitalById(int hospitalId, Hospital hospital);

	public abstract boolean deleteHospitalById(int hospitalId);
}
