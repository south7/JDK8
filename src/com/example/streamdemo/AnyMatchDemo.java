package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
		public static void main(String[] args) {
			List<String> list = Arrays.asList("java","c","Python");
			boolean anyMatch = list.stream().anyMatch(obj->obj.endsWith("a"));
			System.out.println(anyMatch);
		}
	

}
