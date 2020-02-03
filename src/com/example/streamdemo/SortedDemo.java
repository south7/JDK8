package com.example.streamdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {

		//自然排序
		List<String> list = Arrays.asList("java","c","Python");
		List<String> list2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		//自定义排序
		List<String> list3 = Arrays.asList("c++","c#","Visual Basic.NET");
		//根据元素长度排序
		//List<String> list4 = list3.stream().sorted(Comparator.comparing(obj->obj.length())).collect(Collectors.toList());
		//System.out.println(list4);
		
		//List<String> list5 = list3.stream().sorted(Comparator.comparing(obj ->obj.length(),Comparator.reverseOrder())).collect(Collectors.toList());
		//System.out.println(list5);
		
		List<String> list6=list3.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
		System.out.println(list6);

	}

}
