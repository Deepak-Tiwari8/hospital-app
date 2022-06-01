package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonInterfaceDao;
import com.ty.hospital_app.dto.Person;

public class PersonDaoimpl implements PersonInterfaceDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("deepak");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {
	     entityTransaction.begin();
	     entityManager.persist(person);
	     entityTransaction.commit();
  		return entityManager.find(Person.class, person.getPersonId());
	}

	public boolean deletePersonById(int personId) {
		Person person = entityManager.find(Person.class, personId);
		if(person!=null)
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		else
		{
		return false;
		}
	}

	public Person updatePerson(int personId, Person person) {
	  Person person2 = entityManager.find(Person.class, personId);
	  if(person2!=null)
	  {
		  person2.setPersonId(personId);
		  entityTransaction.begin();
		  entityManager.merge(person2);
		  entityTransaction.commit();
		  return entityManager.find(Person.class, person2.getPersonId());
	  }
  		return null;
	}

	public Person getPersonById(int personId) {
		return entityManager.find(Person.class, personId);
	}

	public List<Person> getAllPersons() {
		String sql = "SELECT p FROM Person p";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
