package com;

import java.util.ArrayList;

public class Arraylist12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();//create object
a.add("Rahul");
a.add("Sheety");
a.add("Vijay");
a.add("Vijay");
a.add("Vijay");
a.remove(2);
System.out.println(a.get(3));
for(int i =0;i<a.size();i++)
	
	for(String val :a)
{
	System.out.println(val);
}
a.contains("Selenium");
	}

}
