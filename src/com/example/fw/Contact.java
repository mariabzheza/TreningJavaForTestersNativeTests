package com.example.fw;

public class Contact {

	public String firstName;
	public String lastName;

	public Contact setFirstName (String firstname) {
		
		this.firstName = firstname;
		return this;
	}

	public Contact setLastName(String lastName) {
		
		this.lastName = lastName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
