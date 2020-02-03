package com.example.lambdademo;
/**
 * 接口实现方法比较
 * @author thehe
 *
 */
public class LambdaDemo {
	
	public static void main(String[] args) {
		//使用接口实现类
		Test test = new TestImpl();
		test.test();
		//使用匿名内部类
		Test test2 = new Test() {
			
			@Override
			public int test() {
				System.out.println("匿名内部类中test方法执行了");
				return 0;
			}
		};
		test2.test();
		//使用lambda表达式实现
		 Test test3=()->1;
		 System.out.println(test3.test());//输出1
		
	}

}
