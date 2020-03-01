package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,80,90,100);
		Map<Boolean, List<Integer>> map = asList.stream().collect(Collectors.partitioningBy(obj->obj>60));
		List<Integer> list = map.get(true);
		List<Integer> list2 = map.get(false);
		System.out.println(list);
		System.out.println(list2);
	}
}
