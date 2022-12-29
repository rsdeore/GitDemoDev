package com;

public class constructor {

	int rollNo1;
	String name1;
	String city1;
	public constructor(int rollNo, String name, String city) {
	
		rollNo1= rollNo;
		name1 = name;
		city1 = city;
	}
	public constructor(int rollNo, String name) {
		
		rollNo1 = rollNo;
		name1 = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "constructor[rollNo="+rollNo1+",name="+name1+",city="+city1+"]";
	}
	public static void main(String[]args)
	{
		constructor student =new constructor(1,"Rahul","Pune");
		constructor student1=new constructor(1,"Rahul");
		System.out.println(student);
		System.out.println(student1);
		
	}
	
}