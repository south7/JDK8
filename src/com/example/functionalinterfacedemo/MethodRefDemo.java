package com.example.functionalinterfacedemo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefDemo {
	
	public static void main(String[] args) {
		//静态方法引用
		Function<String, Long> function=Long::parseLong;
		Long apply = function.apply("123");
		System.out.println(apply);
		
		//实例方法引用
		String str=new String("实例方法引用");
		Function<String, Integer> function2=String::length;
		Integer len = function2.apply(str);
		System.out.println(len);
		
		//构造函数:无参
		Supplier<Person> supplier=Person::new;
		Person person = supplier.get();
		System.out.println(person);
		
		//构造函数引用:一个参数
		Function<String, Person> function3=Person::new;
		Person apply2 = function3.apply("jack");
		System.out.println(apply2);
		
		//构造函数引用:两个参数
		BiFunction<Integer, String,Person> biFunction=Person::new;
		Person apply3 = biFunction.apply(12, "tony");
		System.out.println(apply3);
		
		//方法引用作为参数
		test("方法引用作为参数", String::length);
		
	}
	/**
	 * 方法引用作为参数
	 * @param param 参数 
	 * @param function 方法引用
	 */ 
	public  static void test(String param,Function<String, Integer> function){
		Integer apply = function.apply(param);
		System.out.println(apply);
	}
}
