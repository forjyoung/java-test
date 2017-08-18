package com.luosheng.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

public class SetObject {
	
	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		Set<Map> set = new HashSet<>();
		Set<String> ss = new HashSet<>();
//		JSONObject json1 = new JSONObject();
//		JSONObject json2 = new JSONObject();
		
		map1.put("a", "test");
		map2.put("a", "test1");
		
//		json1.put("b", "123123");
//		json2.put("b", "sss");
		ss.add("c");
		ss.add("c");
		set.add(map2);
		set.add(map1);
		System.out.println(set);
		System.out.println(ss);
	}

}
