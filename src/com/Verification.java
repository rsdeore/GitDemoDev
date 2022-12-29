package com;

public class Verification {
	static int a=10;
	static {
		System.out.println("this is static block1");
		System.out.println(a);
		
	}
	static {
		System.out.println("this is static block2");
		System.out.println(a);
	}
	
	public static void main(String[] args)
	 
	{
	
	System.out.println("this is static method");	
	}
	static {
		System.out.println("this is static block3");
		System.out.println(a);
	}

}
