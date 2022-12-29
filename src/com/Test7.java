package com;

import java.util.Scanner;

public class Test7 {

	public int add(int a,int b)
	{
		// TODO Auto-generated method stub
     int c=a+b;
     return c;
	}
public static void main(String[] args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter  number a");
	int a=scanner.nextInt();
	System.out.println("Enter number b");
	int b=scanner.nextInt();
	System.out.println("Addition"+(a+b));
	Test7 test=new Test7();
	test.add(a, b);
	System.out.println("Addition"+(a+b));
}
}