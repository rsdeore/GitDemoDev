package com;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public HashMap<Integer,String> addEmployee(){
	
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(101, "Ravi");
		hashMap.put(102, "Ramesh");
		hashMap.put(103, "Ram");
		return hashMap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMapDemo hashMapDemo=new HashMapDemo();
     System.out.println(hashMapDemo.addEmployee());
     HashMap<Integer,String> hashmap=hashMapDemo.addEmployee();
     System.out.println(hashmap);
     Map<Integer,String> map=hashMapDemo.addEmployee();
     System.out.println(map);
	}

}
