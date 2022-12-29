package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList al=new ArrayList(); al.add(10); al.add(20); al.add(60); al.add(10);
		 * al.add(10); al.add(10); System.out.println(al); Set hs=new HashSet(al);//new
		 * concept System.out.println(hs);
		 */
		
		TreeSet ts=new TreeSet(); 
		ts.add(20);
		ts.add(30); 
		ts.add(50); 
		//ts.add(null);
		 //ts.add("Rahul");
		//System.out.println(ts);
		TreeSet ts1=new TreeSet(); 
		ts1.add(20);
		ts1.add(30); 
		ts1.add(50); 
		ts.addAll(ts1);
		System.out.println(ts);
		
		/*
		 * HashSet hs=new HashSet();//insertion order not preserved duplicae not allowed
		 * hs.add("Rahul"); hs.add("Sachin"); hs.add(null); hs.add(10); hs.add(20);
		 * hs.add("Sachin"); System.out.println(hs);
		 * 
		 * LinkedHashSet hs1=new LinkedHashSet();//insertion order preserved duplicae
		 * not allowed hs1.add("Rahul"); hs1.add("Sachin"); hs1.add(null); hs1.add(10);
		 * hs1.add(20); hs1.add("Sachin"); System.out.println(hs1);
		 * 
		 * TreeSet ts=new TreeSet(); ts.add(20); ts.add(30); ts.add(50); //ts.add(null);
		 * //ts.add("Rahul"); System.out.println(ts);
		 */
		
		
		

	}

}
