package com.example.collectordemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		System.out.println("list: "+list);
		
		List<Integer> list2 = list.stream().collect(Collectors.toList());
		System.out.println("tolist(): "+list2);
		
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println("toSet(): "+set);
		
		//自定义实现Collection数据结构
		LinkedList<Integer> linkedList = list.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println("linkedList :" +linkedList);
		
	}

}
