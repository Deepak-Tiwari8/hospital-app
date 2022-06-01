package com.ty.hospital_app.controller;

import com.ty.hospital_app.dao.impl.HospitalDaoimpl;
import com.ty.hospital_app.dto.Hospital;

public class GethospitalById {

	public static void main(String[] args) {
		HospitalDaoimpl hospitalDaoimpl = new HospitalDaoimpl();
		Hospital hospital2 = hospitalDaoimpl.getHospitalById(1);
		System.out.println(hospital2);
	}

}
