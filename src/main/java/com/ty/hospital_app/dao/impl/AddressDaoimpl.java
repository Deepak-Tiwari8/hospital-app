package com.ty.hospital_app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.AddressInterfaceDao;
import com.ty.hospital_app.dto.Address;

public class AddressDaoimpl implements AddressInterfaceDao
 {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	@Override
	public Address saveAddress(Address address) {
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return entityManager.find(Address.class, address.getAddressId());
	}

	@Override
	public boolean deleteAddress(int addressId) {
		Address address = entityManager.find(Address.class,addressId);
		if(address!=null)
		{
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public Address updateAddress(int addressId, Address address) {
		Address address2 = entityManager.find(Address.class,addressId);
		if(address2!=null)
		{
			address2.setAddressId(addressId);
			entityTransaction.begin();
			entityManager.merge(address2);
			entityTransaction.commit();
			return entityManager.find(Address.class, address2.getAddressId());
		}
		return null;
	}

	@Override
	public Address getAddressById(int addressId) {
		return entityManager.find(Address.class, addressId);
	}

}
