package com.luosheng.test;

import java.util.ArrayList;
import java.util.List;

public class TestListSizeZero {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(1);
		}
	}
}
