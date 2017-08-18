package com.luosheng.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	
	public static boolean isNumeric(String str){ 
 	   Pattern pattern = Pattern.compile("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$"); 
 	   Matcher isNum = pattern.matcher(str);
 	   if( !isNum.matches() ){
 	       return false; 
 	   } 
 	   return true; 
 	}
	public static void main(String[] args) {
		
		boolean is  = isNumeric("1.1");
		System.out.println(is);
		System.out.println(Double.parseDouble("1"));
		Long a = 10201L;
		int b = 10201;
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}
