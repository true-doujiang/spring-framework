package com.yhh.spring.test.domain;

//import lombok.Data;

import java.util.Date;

//@Data
public class Animal {


	private String name;
	private String address;
	private Date age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}
}
