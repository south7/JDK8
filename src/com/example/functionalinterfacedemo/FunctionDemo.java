package com.example.functionalinterfacedemo;

import java.util.function.Function;

public class FunctionDemo implements Function<Object, Object>{
    /**
     *自定义 实现Function接口,重写方法apply()
     *仅作介绍方便理解，不作为常规使用方式
     */
	@Override
	public Object apply(Object t) {
		return t+",function apply()处理后";
	}
	
	public static void main(String[] args) {
		System.out.println(new FunctionDemo().apply("test"));
		
		//常规使用
		Function<Integer, Integer> function=input->input*10;
		System.out.println(function.apply(10));
	}
}
