package com.example.defaultdemo;

public interface DefaultInterface {
	
	void interfaceMethod();
	
	default void interfaceMethodWithBody(){
		System.out.println("打印接口中default修饰的方法");
	}
	
	static void interfaceStaticMethodWithBody(){
		System.out.println("打印接口中static修饰的方法");
	}
	

}
