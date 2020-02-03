package com.example.base64demo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class JDK8Base64 {
	/**
	 * JDK8的java.util包中，新增了Base64的类
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		 Base64.Decoder decoder = Base64.getDecoder();
		 Base64.Encoder encoder = Base64.getEncoder();
		 String text = "冬至";
		 byte[] textByte = text.getBytes("GB2312");
		 //编码
		 String encodedText = encoder.encodeToString(textByte);
		 System.out.println(encodedText);
		 //解码
		 System.out.println(new String(decoder.decode(encodedText), "GB2312"));
	}

}
