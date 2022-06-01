package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedOrderInterfaceDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderDaoimpl implements MedOrderInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public MedOrder saveMedOrder(int encounterId, MedOrder medOrder) {
		Encounter encounter = entityManager.find(Encounter.class, encounterId);

		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityManager.persist(encounter);
		entityTransaction.commit();
		return entityManager.find(MedOrder.class, medOrder.getMedOrderId());
	}

	@Override
	public MedOrder getMedOrder(int medOrderId) {
		return entityManager.find(MedOrder.class, medOrderId);
	}

	@Override
	public List<MedOrder> getAllMedOrders(int encounterId) {
		Encounter encounter = entityManager.find(Encounter.class, encounterId);
		String sql = "SELECT m FROM MedOrder m";
		Query query = entityManager.createQuery(sql);

		return query.getResultList();
	}

	@Override
	public MedOrder updateMedOrder(int medOrderId, MedOrder medOrder) {
		MedOrder medOrder2 = entityManager.find(MedOrder.class, medOrderId);
		if (medOrder2 != null) {
			medOrder2.setMedOrderId(medOrderId);
			entityTransaction.begin();
			entityManager.merge(medOrder2);
			entityTransaction.commit();
			System.out.println("successfully medOrder updated");
			return entityManager.find(MedOrder.class, medOrder2.getMedOrderId());
		} else {
			System.out.println("Sorry medOrder id is wrong");
			return null;
		}
	}

	@Override
	public boolean deleteMedOrder(int medOrderId) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrderId);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			System.out.println("Data deleted");
			return true;
		} else {
			System.out.println("MedOrder id is wrong");
			return false;
		}

	}

}
