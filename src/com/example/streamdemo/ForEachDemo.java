package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		list.forEach(obj->System.out.println(obj));
		list.stream().forEach(obj->System.out.println(obj));
	}

}
