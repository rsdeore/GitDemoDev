package com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(20);
		ls.add(1,50);
		ls.addLast(90);
		System.out.println(ls);
		Iterator<Integer> itr=ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(int i:ls)
		{
			System.out.println(i);
		}

	}

}
