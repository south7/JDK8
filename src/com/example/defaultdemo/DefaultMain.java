package com.example.defaultdemo;

public class DefaultMain {
	public static void main(String[] args) {
		DefaultImpl defaultImpl=new DefaultImpl();
		defaultImpl.interfaceMethod();
		defaultImpl.interfaceMethodWithBody();
		DefaultInterface.interfaceStaticMethodWithBody();
	}

}
