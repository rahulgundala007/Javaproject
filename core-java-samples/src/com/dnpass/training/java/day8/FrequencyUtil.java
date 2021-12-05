package com.dnpass.training.java.day8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"if","it","is","to","be","it","to"};
		
		Map<String,Integer> m = new HashMap<String, Integer>();
		//initialize freq table from command line
		for (String a :words) {
			Integer freq = m.get(a);
			m.put(a, (freq==null) ? 1 : freq +1);
		}
		System.out.println(m.size()+"distinct word:");
		System.out.println(m);

	}

}
