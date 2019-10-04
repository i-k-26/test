package com.internousdev.multipledisplay.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.multipledisplay.util.Person;
import com.opensymphony.xwork2.ActionSupport;

public class multipleDisplayAction extends ActionSupport {

	private List<Person> personList = new ArrayList<Person>();

	public String execute() {

		String result;

		Person sato = new Person("sato", 28);
		Person monzen = new Person("monzen", 22);
		Person suzuki = new Person("suzuki", 31);

		personList.add(sato);
		personList.add(monzen);
		personList.add(suzuki);

		result = SUCCESS;
		return result;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

}