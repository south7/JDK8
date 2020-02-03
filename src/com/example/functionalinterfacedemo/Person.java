package com.example.functionalinterfacedemo;

public class Person {
	private Integer age;
	private String name;
	
	public Person() {
		super();
	}
	public Person(Integer age) {
		super();
		this.age = age;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
