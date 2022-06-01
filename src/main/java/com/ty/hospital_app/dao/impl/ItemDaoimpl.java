package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemInterfaceDao;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.dto.Observation;

public class ItemDaoimpl implements ItemInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Item saveItem(int medOrderId, Item item) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrderId);
		entityTransaction.begin();
		entityManager.persist(item);
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return entityManager.find(Item.class,item.getItemId());
	 }

	public Item getItemById(int itemId) {
		return entityManager.find(Item.class, itemId);
	}

	public Item getItemByName(int itemName) {
		return entityManager.find(Item.class, itemName);
	}

	public Item updateItemById(int itemId, Observation observation, Item item) {
		Item item1 = entityManager.find(Item.class, itemId);
		if (item1 != null) {
			item1.setItemId(itemId);
			entityTransaction.begin();
			entityManager.persist(observation);
			entityManager.merge(item1);
			entityTransaction.commit();
			return entityManager.find(Item.class, item1.getItemId());
		}
		return null;
	}

	public List<Item> getAllItemsByMedOrderId(int medOrderId) {
		String sql = "SELECT i FROM Item i";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public boolean deleteItemById(int itemId) {
		Item item1 = entityManager.find(Item.class, itemId);
		if (item1 != null) {
			entityTransaction.begin();
			entityManager.remove(item1);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
