package com.dnpass.training.java.day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		colors.add("Yellow");
		//print the hash set
		System.out.println("the hash set: "+colors);
		//set Iterator
		Iterator<String> p =colors.iterator();
		//Iterate the hash set
		while (p.hasNext()) {
			System.out.println(p.next());
		}
		System.out.println("size of the hash set "+ colors.size());
		System.out.println("check the above list is empty or not "+ colors.isEmpty());
		//colors.removeAll(colors);
		//System.out.println("the hash set after using remove: "+colors);
		//System.out.println("check the above list is empty or not "+ colors.isEmpty());
		
		
		
		//creating new hash set
		HashSet<String > NewHash = new HashSet<String>();
		System.out.println(NewHash);
		
		//creating an array
		
		String[] arr = new String[colors.size()];
		colors.toArray(arr);
		
		for(String element : arr) {
			System.out.println(element);
			
		}
		//creating a treeset
		
		Set<String> treeSet = new TreeSet<String>(colors);
		System.out.println(treeSet);
		
		for(String elements: treeSet) {
			System.out.println("the treeset elements "+ elements);
		}
		
		List<String> list = new ArrayList<String>(colors);
		System.out.println(list);
		String[] args1 = {"a","c","s","t","i","a","c"};
		
		Set<String >  uniques = new HashSet<String>();
		Set<String >  dups = new HashSet<String>();
		for (String a :args1) {
			if(!uniques.add(a)) {
				dups.add(a);
			}
				
		}
		System.out.println(uniques);
		System.out.println(dups);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
