package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Employee> al=new ArrayList();
//Employee emp1=new Employee(12, "Mumbai", "Ram");
//Employee emp=new Employee(11, "Pune", "Rahul");

al.add(new Employee(12, "Mumbai", "Ram"));
al.add(new Employee(11, "Pune", "Rahul"));
al.forEach(arrayList-> System.out.println(arrayList) );//short method
//System.out.println(al);
}

//ArrayList<Integer> al2=new ArrayList<Integer>();
//al2.add(10);
//al2.add(30);
//al2.add(20);
//al2.add(40);
//al2.add(50);
//al2.add(30);
//al.addAll(al2);

//3rd way

/*
 * /Iterator<Employee> itr=al.iterator(); { while(itr.hasNext()) {
 * System.out.println(itr.next()); } }
 */
}