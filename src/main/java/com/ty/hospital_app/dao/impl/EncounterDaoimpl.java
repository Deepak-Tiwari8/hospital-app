package com.ty.hospital_app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.EncounterInterfaceDao;
import com.ty.hospital_app.dto.Encounter;

public class EncounterDaoimpl  implements EncounterInterfaceDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Encounter saveEncounter(Encounter encounter) {
		entityTransaction.begin();
		 entityManager.persist(encounter);
		 entityTransaction.commit();
		return entityManager.find(Encounter.class, encounter.getEncounterId());
	}

}
