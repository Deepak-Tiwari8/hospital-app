package com.ty.hospital_app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.HospitalInterfaceDao;
import com.ty.hospital_app.dto.Hospital;

public class HospitalDaoimpl implements HospitalInterfaceDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return entityManager.find(Hospital.class, hospital.getHospitalId());
	}

	public Hospital getHospitalById(int hospitalIdId) {
		
		return entityManager.find(Hospital.class, hospitalIdId);
	}

	public Hospital updateHospitalById(int hospitalId, Hospital hospital) {
    Hospital hospital1 = entityManager.find(Hospital.class, hospitalId);
    if(hospital1!=null)
    {
    	hospital1.setHospitalId(hospitalId);
    	entityTransaction.begin();
    	entityManager.merge(hospital1);
    	entityTransaction.commit();
    	return entityManager.find(Hospital.class, hospital1.getHospitalId());	
    }
		return null;
	}

	public boolean deleteHospitalById(int hospitalId) {
		Hospital hospital = entityManager.find(Hospital.class, hospitalId);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		else
		{
		return false;
	  }
	}

}
