package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
	public static void main(String[] args) {
		//累加计算
		List<Integer> list = Arrays.asList(1,2,3,4);
		Optional<Integer> optional = list.stream().reduce((a,b)->a+b);
		System.out.println(optional.get());
		//求集合中最大值
		Optional<Integer> optional2 = list.stream().reduce((a,b)->a>b?a:b);
		System.out.println(optional2.get());
		//初始值累加计算
		Integer integer = list.stream().reduce(20, (a,b)->a+b);
		System.out.println(integer);
	}

}
