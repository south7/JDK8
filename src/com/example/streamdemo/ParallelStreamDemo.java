package com.example.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//串行流
		list.stream().forEach(obj->System.out.println(obj));
		//并行流
		list.parallelStream().forEach(obj->System.out.println(obj));
		
		//线程安全问题
		List<Integer> list2 = new ArrayList<Integer>();
		IntStream.range(0, 100).parallel().forEach(list2::add);
		System.out.println(list2.size());
		
	}

}
