package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args)//user name unique key(roll) value(name)
	{
		// TODO Auto-generated method stub
HashMap<Integer, String> hm=new HashMap<Integer, String>();
hm.put(101, "Ram");//key=101,value=ram ..hashcode(25889)>>16>>index(2)key(1) value(233433)
hm.put(102, "Sachin");
hm.put(103, "Sachin");
hm.put(103, "Sachin");
hm.put(104, "Sachin");
hm.put(107, "Sai");
hm.put(105, "Sairam");
hm.put(105, "Sairam");
//System.out.println(hm);
hm.forEach((k, v) -> System.out.println(k +" "+v));
//java.util.Set<Integer> s=hm.keySet();
//Iterator<Integer> itr=s.iterator();
//while(itr.hasNext())
//{
//	int i=itr.next();//key value assigned
//	//System.out.println(i);
//	System.out.println(i+" "+hm.get(i));
//}
	}
}
