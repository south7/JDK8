package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
	public static void main(String[] args) {
		//分组
		List<Person> asList = Arrays.asList(new Person(20, "jack"),new Person(20, "tony"),new Person(22, "jerry"),
				new Person(22, "marry"),new Person(25, "jony"),new Person(25, "bob"),new Person(27, "james"));
		Map<Integer, List<Person>> map = asList.stream().collect(Collectors.groupingBy(obj->obj.getAge()));
		map.forEach((key,value)->{
			System.out.println(key+"==");
			value.forEach(obj->System.out.println(obj.getName()));
			
		});
		
		//分组统计
		Map<Integer, Long> map2 = asList.stream().collect(Collectors.groupingBy(obj->obj.getAge(), Collectors.counting()));
		map2.forEach((key,value)->{
			System.out.println(key+"年龄人数:"+map2.get(key));
		});
	}

}

class Person{
	
	private int age;
	private String name;
	
	public Person() {
		super();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
