package com.luosheng.test;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		String dou = "02.10";
		Double dd = 2.12D;
		System.out.println((String)dou);
		System.out.println(dd);
	    DecimalFormat decimalFormat = new DecimalFormat("#.%");  
        System.out.println(decimalFormat.format(dd));   //12  
        System.out.println(subZeroAndDot(dou));
	}
	
	
	/**
	 * 使用java正则表达式去掉多余的.与0
	 * @param s
	 * @return 
	 */
	public static String subZeroAndDot(String s){
		if(s.indexOf(".") > 0){
			s = s.replaceAll("0+?$", "");//去掉多余的0
			s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
		}
		return s;
	}
	
}
