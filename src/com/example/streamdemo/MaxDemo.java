package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		Optional<Integer> optional = list.stream().max((a,b)->Integer.compare(a, b));
		System.out.println("max: "+optional.get());
		Optional<Integer> optional2 = list.stream().min((a,b)->Integer.compare(a, b));
		System.out.println("min: "+optional2.get());
	}

}
