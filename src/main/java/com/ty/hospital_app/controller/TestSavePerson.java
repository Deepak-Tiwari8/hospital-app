package com.ty.hospital_app.controller;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.impl.PersonServiceimpl;

public class TestSavePerson {

	public static void main(String[] args) {
    Person person = new Person();
    person.setPersonName("vivek");
    person.setEmail("vivek@gmail.com");
    person.setPersonPhone(9876543567l);
    
    PersonServiceimpl personServiceimpl = new PersonServiceimpl();
    personServiceimpl.savePerson(person);
	}

}
