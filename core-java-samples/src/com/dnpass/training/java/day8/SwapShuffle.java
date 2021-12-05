package com.dnpass.training.java.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwapShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		colors.add("Yellow");
		
		List<String> list= new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("r");
		Collections.shuffle(list);
		System.out.println("the Shuffle "+list);
		Collections.swap(list, 2, 3);
		System.out.println("after the swap "+list);

	}

}
