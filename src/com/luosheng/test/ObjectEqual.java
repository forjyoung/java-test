package com.luosheng.test;

import java.util.Objects;

public class ObjectEqual {
	public static void main(String[] args) {
		String a = "2";
		String b = "2";
		Integer c = 2;
		Double d = 2D;
		double e = 2D;
		String f = "21";
		String g = a + "1";
		System.out.println("2" == "2");
		System.out.println(a == b);
		System.out.println(Objects.equals(a, b));
		System.out.println(Objects.equals(a, c));
		System.out.println(Objects.equals(d, c));
		System.out.println(Objects.equals(d, e));
		System.out.println(f == g);
		System.out.println(Objects.equals(f, g));
	}
}
