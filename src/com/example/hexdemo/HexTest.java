package com.example.hexdemo;

public class HexTest {
	/**
     * 将字符串转为指定编码的16进制
     *
     * @param str
     * @return
     */
    public static String encode(String str) throws Exception {
        String hexString = "0123456789ABCDEF";
        //根据编码获取字节数组
        byte[] bytes = str.getBytes("UTF-8");
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        //将字节数组中每个字节拆解成2位16进制整数
        for (int i = 0; i < bytes.length; i++) {
            sb.append(hexString.charAt((bytes[i] & 0xf0) >> 4));
            sb.append(hexString.charAt((bytes[i] & 0x0f) >> 0));
        }
        return sb.toString();
    }
    
    /**
     * 将16进制字符串转换为byte[]
     *
     * @param str
     * @return
     */
    public static byte[] toBytes(String str) {
        if (str == null || str.trim().equals("")) {
            return new byte[0];
        }

        byte[] bytes = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            String subStr = str.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte) Integer.parseInt(subStr, 16);
        }

        return bytes;
    }
    
    public static void main(String[] args) throws Exception {
    	String encode = encode("_*/~我的天");
    	System.out.println(encode);
    	String string = new String(toBytes(encode), "UTF-8");
    	System.out.println(string);
    	
    	System.out.println("__________________");
    	
    	String encode2 = encode("我&#%G");
    	System.out.println(encode2);
    	String string2 = new String(toBytes(encode2), "UTF-8");
    	System.out.println(string2);
	}
}
