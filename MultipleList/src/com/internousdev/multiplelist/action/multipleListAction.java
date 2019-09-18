package com.internousdev.multiplelist.action;

import java.util.ArrayList;

import com.internousdev.multiplelist.util.Person;

public class multipleListAction {
	public static void main(String[] args) {

	Person sato = new Person("sato", 28);
	Person monzen = new Person("monzen", 22);
	Person suzuki = new Person("suzuki", 31);

	ArrayList<Person> personList = new ArrayList<Person>();

	personList.add(sato);
	personList.add(monzen);
	personList.add(suzuki);
	
	}
}