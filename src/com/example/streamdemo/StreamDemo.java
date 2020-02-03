package com.example.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("jack","tony","pony");
		/**
		 * 操作详解
		 * 
		 * list:元素集合，可以是List,Map,Set等
		 * .stream():生成流，这里是串行流；parallelStream()生成的是并行流
		 * .map():中间操作，这里是映射函数，参数是Function接口;中间操作可以是排序，过滤，聚合等
		 * .collect():终端操作，进行流统一收集
		 */
		List<String> list2 = list.stream().map(obj->"I am "+obj).collect(Collectors.toList());
		System.out.println(list2);
	}

}
