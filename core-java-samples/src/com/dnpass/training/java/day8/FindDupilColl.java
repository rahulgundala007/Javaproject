package com.dnpass.training.java.day8;



import java.util.LinkedHashSet;


import java.util.Set;



public class FindDupilColl {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list = new ArrayList<String>();
		//System.out.println(list);
		String[] args1 = {"a","c","s","t","i","a","c"};
		
		Set<String >  uniques = new LinkedHashSet<String>();
		Set<String >  dups = new LinkedHashSet<String>();
		for (String a :args1) {
			if(!uniques.add(a)) {
				dups.add(a);
			}
				
		}
		System.out.println(uniques);
		System.out.println(dups);
	}

}
