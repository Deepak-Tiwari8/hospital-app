package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonInterfaceDao {

	public abstract Person savePerson(Person person);

	public abstract boolean deletePersonById(int personId);

	public abstract Person updatePerson(int personId, Person person);

	public abstract Person getPersonById(int personId);

	public abstract List<Person> getAllPersons();
}
