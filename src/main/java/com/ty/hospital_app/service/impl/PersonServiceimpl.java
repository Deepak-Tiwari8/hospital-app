package com.ty.hospital_app.service.impl;

import java.util.List;


import com.ty.hospital_app.dao.PersonInterfaceDao;
import com.ty.hospital_app.dao.impl.PersonDaoimpl;
import com.ty.hospital_app.dto.Person;

public class PersonServiceimpl implements PersonInterfaceDao {
	PersonDaoimpl personDaoimpl = new PersonDaoimpl();

	public Person savePerson(Person person) {
		return personDaoimpl.savePerson(person);
	}

	public boolean deletePersonById(int personId) {
		return personDaoimpl.deletePersonById(personId);
	}

	public Person updatePerson(int personId, Person person) {
		return personDaoimpl.updatePerson(personId, person);
	}

	public Person getPersonById(int personId) {
		return personDaoimpl.getPersonById(personId);
	}

	public List<Person> getAllPersons() {
		return personDaoimpl.getAllPersons();
	}

}
