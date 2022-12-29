package com;

public class Constr {

	public Constr() 
	{
	System.out.println("This is empty constructor>>>>>");	

	}
	
	public Constr(int x)
	{
	this("java");
	System.out.println("This is int arg constr>>>>");
	}
	public Constr(String str)
	{
	System.out.println("This is String arg constr>>>>");	
	}
	public static void main(String[] args )
	{
		Constr test=new Constr(10);
	}
}