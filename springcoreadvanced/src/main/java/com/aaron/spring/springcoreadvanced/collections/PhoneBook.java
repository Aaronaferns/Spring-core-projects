package com.aaron.spring.springcoreadvanced.collections;

import java.util.List;

public class PhoneBook {
	private List<String> phoneNumbers;

	@Override
	public String toString() {
		return "PhoneBook [phoneNumbers=" + phoneNumbers + "]";
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
}
