package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserInterfaceDao;
import com.ty.hospital_app.dto.User;

public class UserDaoimpl implements UserInterfaceDao
{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return entityManager.find(User.class, user.getUserId());
	}

	public User updateUser(int userId, User user) {
		User user1 = entityManager.find(User.class, userId);
		if (user1 != null) {
			user1.setUserId(userId);
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return entityManager.find(User.class, user.getUserId());
		} else {
			return null;
		}
	}

	public boolean deleteUser(int userId) {
		User user = entityManager.find(User.class, userId);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public User getUserById(int userId) {
		return entityManager.find(User.class, userId);
	}

	public User getUserByRole(String userRole) {

		return entityManager.find(User.class, userRole);
	}

	public User getUserByPhone(long userPhone) {
		return entityManager.find(User.class, userPhone);
	}

	public User validateUser(String userEmail, String userPassword) {
		String sql = "SELECT u FROM User u WHERE userEmail=?1 AND UserPassword=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, userEmail);
		query.setParameter(2, userPassword);
		List<User> users = query.getResultList();
		return users.get(0);
	}

	public List<User> getAllUser() {
		String sql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
