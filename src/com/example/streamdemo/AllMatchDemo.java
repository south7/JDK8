package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","c","Python");
		boolean allMatch = list.stream().allMatch(obj->obj.endsWith("a"));
		System.out.println(allMatch);
	}

}
