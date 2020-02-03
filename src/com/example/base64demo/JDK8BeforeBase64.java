package com.example.base64demo;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class JDK8BeforeBase64 {
	/**
	 * JDK8之前Base64编解码处理
	 * 缺点：编解码效率差
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		 BASE64Encoder encoder = new BASE64Encoder();
		 BASE64Decoder decoder = new BASE64Decoder();
		 String text = "_*/~&%";
		 byte[] textByte = text.getBytes("UTF-8");
		 //编码
		 String encodedText = encoder.encode(textByte);
		 System.out.println(encodedText);
		 //解码
		 System.out.println(new String(decoder.decodeBuffer(encodedText),"UTF-8")); 
	}
	
	//还有一种方式是Apache Commons Codec有提供Base64编码和解码，缺点是需要引用

}
