package com.model;

public class User {
	String Name,Gender,Address;
    String Age;

	public User(String name,String age,String gender,String address) {
		super();
		this.Name = name;
	
		this.Age = age;
		this.Gender = gender;
		this.Address= address;
	}

	public String getName() {
		return Name;
	}

	
	public String getAge() {
		return Age;
	}
	
	public String getGender() {
		return Gender;
	}
	public String getAddress() {
		return Address;
	}
	
	

}
