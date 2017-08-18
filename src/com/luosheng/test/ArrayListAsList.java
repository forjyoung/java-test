package com.luosheng.test;

import java.util.Arrays;
import java.util.List;

public class ArrayListAsList {
	public static void main(String[] args) {
		String[] str = new String[] { "a", "b" };
		List list = Arrays.asList(str);
//		list.add("c");
		System.out.println(list);
		str[0] = "ggg";
		System.out.println(list);
	}
}
