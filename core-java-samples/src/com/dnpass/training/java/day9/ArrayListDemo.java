package com.dnpass.training.java.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> colors = new HashSet<String>();
             colors.add("Red");
             colors.add("Green");
             colors.add("Black");
             colors.add("White");
             colors.add("Pink");
             colors.add("Yellow");
             
             
        System.out.println("The Hash Set:  " +colors );
        
        Iterator<String> colorsItrp = colors.iterator();
        
        while (colorsItrp.hasNext())
        {
        	System.out.println(colorsItrp.next());
        }
        System.out.println("Size of the  Hash Set:  " +colors.size());
        
        System.out.println("Checking the above Array list is empty or not:  " +colors.isEmpty());
        
         colors.clear();
         colors.removeAll(colors);
         System.out.println("Hash Set after removing all the elements:" +colors);
         
         
         System.out.println("Checking the above Array list is empty or not:  " +colors.isEmpty());
         
         
         HashSet <String> new_h_set = (HashSet<String>)colors;
         
         
         HashSet <String> new_h_set_clone = (HashSet)colors;
         new_h_set_clone.add("new color");
         new_h_set = (HashSet)colors;
         new_h_set.add("new color");
         System.out.println("cloned Hash Set: " + new_h_set);
         
         String[] new_array = new String[colors.size()];
         colors.toArray(new_array);
         
         System.out.println("Array elemenmts: ");
         for(String element : new_array)
         {
        	 System.out.println(element);
         }
         
         Set<String> tree_set = new TreeSet<String>(colors);
         
         
         System.out.println("TreeSet Elements: ");
         for(String element : tree_set)
         {
        	System.out.println(element); 
         }
         
         
         List<String> list = new ArrayList<String>(colors);
         
         System.out.println("ArrayList contains: "+ list);
         
         HashSet<String>h_set2 = new HashSet<String>();
         h_set2.add("Red");
         h_set2.add("Pink");
         h_set2.add("Black");
         h_set2.add("Orange");
         System.out.println("Second HashSet content "+h_set2);
         colors.retainAll(h_set2);
         System.out.println("HashSet content: ");
         System.out.println(colors);
         
         colors.removeAll(h_set2);
         
         colors.clear();
         
           System.out.println("HashSet content: "+colors);
           
           String []  args1 = {"a","b","b","c","d","e"};
              
          Set<String> uniques = new HashSet<String>();
          Set<String> dups = new HashSet<String>();
          
          for(String a : args1)
        	  if(!uniques.add(a))
        		  dups.add(a);
          uniques.removeAll(dups);
          
          System.out.println("Unique words:   " +uniques);
          System.out.println("dulicate words:   " +dups);
          
          Set<String> s = new HashSet<String>();
          for(String a : args)
        	  s.add(a); 
          System.out.println(s.size() + " distanct words: " + s );
	}

}
