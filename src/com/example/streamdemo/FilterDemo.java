package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3","11","22","33");
		List<String> list2 = list.stream().filter(obj->obj.length()>1).collect(Collectors.toList());
		System.out.println(list2);
	}

}
