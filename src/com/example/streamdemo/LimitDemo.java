package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","c","Python");
		List<String> list2 = list.stream().sorted().limit(1).collect(Collectors.toList());
		System.out.println(list2);
	}

}
