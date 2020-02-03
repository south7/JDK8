package com.example.defaultdemo;

public class DefaultImpl implements DefaultInterface{

	@Override
	public void interfaceMethod() {
		System.out.println("打印实现类中实现接口中的抽象方法");
	}
	
	/*@Override
	public void interfaceMethodWithBody(){
		System.out.println("打印实现类中重写接口default修饰的方法");
	}*/

}
