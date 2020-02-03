package com.example.datedemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8Date {
	
	public static String getDate(String StrFormat){
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern(StrFormat);
		String  format =dateTimeFormatter.format(localDateTime);
		System.out.println(format);
		return format;
		}
}
