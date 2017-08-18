package com.luosheng.test;

public class ToUnicodeTest {

	public static void main(String[] args) {
		char wuqi = '∞';
		String wuqiStr = Integer.toHexString(wuqi);
		
		System.out.println(wuqiStr);
	}
	
}
