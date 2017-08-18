package com.luosheng.test;

public class DoubleToInteger {
	public static void main(String[] args) {
		Double a = 158.0D;
		double b = 158.0D;
		Object c = 123.1D;
		
		
		System.out.println((int)Math.floor((double)c));
		System.out.println((int)(double)c);
		System.out.println((int)Math.floor(a));
		
		
		System.out.println((int)b);
	}
}
