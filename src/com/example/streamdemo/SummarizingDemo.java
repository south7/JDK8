package com.example.streamdemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingDemo {

	public static void main(String[] args) {
		List<Boss> asList = Arrays.asList(new Boss(20, "jack"), new Boss(20, "tony"), new Boss(22, "jerry"),
				new Boss(22, "marry"), new Boss(25, "jony"), new Boss(25, "bob"), new Boss(27, "james"));

		IntSummaryStatistics intSummaryStatistics = asList.stream().collect(Collectors.summarizingInt(Boss::getAge));

		System.out.println("平均值: " + intSummaryStatistics.getAverage());
		System.out.println("统计个数: " + intSummaryStatistics.getCount());
		System.out.println("最大值: " + intSummaryStatistics.getMax());
		System.out.println("最小值: " + intSummaryStatistics.getMin());
		System.out.println("总和: " + intSummaryStatistics.getSum());
	}

}

class Boss {

	private int age;
	private String name;

	public Boss() {
		super();
	}

	public Boss(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}