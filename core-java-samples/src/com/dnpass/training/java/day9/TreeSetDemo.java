package com.dnpass.training.java.day9;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetDemo {
	 
	public static void main(String [] args)
	{
	        TreeSet<String> tree_set = new TreeSet<String>();
            tree_set.add("Red");
            tree_set.add("Green");
            tree_set.add("Orange");
            tree_set.add("White");
            tree_set.add("Black");
            System.out.println("Tree set: ");
            System.out.println(tree_set);
            
            for(String element : tree_set)
            {	
            	System.out.println(element);
            }
            
            TreeSet<String>tree_set2 = new TreeSet<String>();
            tree_set2.add("Red");
            tree_set2.add("Pink");
            tree_set2.add("Black");
            System.out.println("Tree set2:  " +tree_set2);
            
            tree_set2.addAll(tree_set2);
            System.out.println("Tree set1:  " +tree_set);
            
            Iterator it = tree_set.descendingIterator();
            
            System.out.println("Elements in Reverse order:");
            while(it.hasNext())
            {
            	System.out.println(it.next());
            }
            
            String first_element = tree_set.first();
            System.out.println("First Element is: "+first_element);
            
            String last_element = tree_set.last();
            System.out.println("First Element is: "+last_element);
            
            TreeSet <String> new_t_set = (TreeSet<String>)tree_set.clone();
            System.out.println("clone tree  list: "+tree_set);
            
            System.out.println("size of the Tree set:  " +tree_set.size());
            
            TreeSet <Integer>tree_num = new TreeSet<Integer>();
            TreeSet <Integer>treeheadset = new TreeSet<Integer>();
            
             tree_num.add(1);
             tree_num.add(2);
             tree_num.add(3);
             tree_num.add(4);
             tree_num.add(5);
             tree_num.add(6);
             tree_num.add(7);
             tree_num.add(8);
             tree_num.add(9);
             tree_num.add(10);
             
             treeheadset = (TreeSet)tree_num.headSet(7);
             
             Iterator iterator;
             iterator = treeheadset.iterator();
             
             System.out.println("Tree set data:  ");
             while(iterator.hasNext())
             {
            	 System.out.println(iterator.next() + " ");
             }
            
             System.out.println("Greater than or equal to 86:"+tree_num.ceiling(86));
             System.out.println("Greater than or equal to 29:"+tree_num.ceiling(29));
             
             System.out.println("lesser than or equal to 86:"+tree_num.floor(86));
             System.out.println("lesser than or equal to 29:"+tree_num.floor(29));
             
             System.out.println("Strictly Greater than 76:"+tree_num.higher(76));
             System.out.println("Strctly Greater than  31:"+tree_num.higher(31));
             
             System.out.println("Srrictly lesser than 69:"+tree_num.lower(69));
             System.out.println("Greater than or equal to 12:"+tree_num.lower(12));
             
             System.out.println("Removes the first(lowest) element:"+tree_num.pollFirst());
             System.out.println("Tree set after removing first element:"+tree_num);
             
             System.out.println("Removes the last element:"+tree_num.pollLast());
             System.out.println("Tree set after removing Last element:"+tree_num);
             
             System.out.println("Removing 70 from the list:"+tree_num.remove(70));
             System.out.println("Tree set after removing last element:"+tree_num);
            
            
	}

}