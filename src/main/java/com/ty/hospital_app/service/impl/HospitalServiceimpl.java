package com.ty.hospital_app.service.impl;

import com.ty.hospital_app.dao.HospitalInterfaceDao;
import com.ty.hospital_app.dao.impl.HospitalDaoimpl;
import com.ty.hospital_app.dto.Hospital;

public class HospitalServiceimpl implements HospitalInterfaceDao
{
	HospitalDaoimpl hospitalDaoimpl = new HospitalDaoimpl();
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDaoimpl.saveHospital(hospital);
	}

	public Hospital getHospitalById(int hospitalIdId) {
		return hospitalDaoimpl.getHospitalById(hospitalIdId);
	}

	public Hospital updateHospitalById(int hospitalId, Hospital hospital) {
		return hospitalDaoimpl.updateHospitalById(hospitalId, hospital);
	}

	public boolean deleteHospitalById(int hospitalId) {
		return hospitalDaoimpl.deleteHospitalById(hospitalId);
	}

}
