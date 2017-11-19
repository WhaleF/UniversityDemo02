package com.gem.java.jdbc.pojo;

public class Person {
	private int id;
	private String pname;
	private int age;
	private String address;
	
	public Person(){}

	public Person(int id, String pname, int age, String address) {
		super();
		this.id = id;
		this.pname = pname;
		this.age = age;
		this.address = address;
	}

	public Person(String pname, int age, String address) {
		super();
		this.pname = pname;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	
	
}
	
	