package com.example.collectordemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3");
		String collect = list.stream().collect(Collectors.joining());
		System.out.println(collect);
		
		String collect2 = list.stream().collect(Collectors.joining(","));
		System.out.println(collect2);
		
		String collect3 = list.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect3);
	}

}
