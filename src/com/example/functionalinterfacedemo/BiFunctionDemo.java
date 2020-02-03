package com.example.functionalinterfacedemo;

import java.util.function.BiFunction;
/**
 * BiFunction 使用例子
 * @author thehe
 *
 */
public class BiFunctionDemo {

	public static void main(String[] args) {
		System.out.println(test(1,2,(x,y)->x+y));
		System.out.println(test(1,2,(x,y)->x-y));
		System.out.println(test(1,2,(x,y)->x*y));
		System.out.println(test(1,2,(x,y)->x/y));
	}
	public static Integer test(Integer integer,Integer integer2,BiFunction<Integer, Integer, Integer> biFunction){
		return biFunction.apply(integer, integer2);
	}

}
