package com.ty.hospital_app.controller;

import com.ty.hospital_app.dao.impl.HospitalDaoimpl;
import com.ty.hospital_app.dto.Hospital;

public class TestSaveHospital {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setHospitalName("JayaRam");
		hospital.setHospitalWebsite("www.jayaram.com");

		HospitalDaoimpl hospitalDaoimpl = new HospitalDaoimpl();
		hospitalDaoimpl.saveHospital(hospital);

	}

}
