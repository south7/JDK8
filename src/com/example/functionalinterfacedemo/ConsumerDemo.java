package com.example.functionalinterfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		//定义函数
		Consumer<String> consumer=obj->{
			System.out.println(obj+"消费完成");
		};
		consume("jack",consumer);
		
		//简单写法
		consume("tony",obj->{
			System.out.println(obj+"消费完成");
		});
		
		//常用于集合遍历
		List<String> asList = Arrays.asList("11","22","33");
		asList.forEach(obj->{System.out.println(obj);});
		
	}
	public static void consume(String name,Consumer<String> consumer){
		consumer.accept(name);
	}

}
