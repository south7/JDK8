package com.example.functionalinterfacedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list = test(asList, obj->obj.intValue()>5);
		System.out.println(list);
	}

	/**
	 * 
	 * @param list 接受参数
	 * @param predicate 定义函数
	 * @return 满足一定条件的数据
	 */
	public static List<Integer> test(List<Integer> list,Predicate<Integer> predicate){
		List<Integer> list2=new ArrayList<Integer>();
		for(Integer integer :list ){
			if(predicate.test(integer)){
				list2.add(integer);
			}
		}
		return list2;
		
	}
}
