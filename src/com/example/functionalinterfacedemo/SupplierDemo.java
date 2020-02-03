package com.example.functionalinterfacedemo;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		getObj();
	}
	/**
	 * 可用于工厂设计模式，无参的工厂方法
	 * @return
	 */
	public static Object getObj() {
		Supplier<Object>supplier=()->{
			System.out.println("生产对象");
			return new Object();
			
		};
		return supplier.get();
	}

}
