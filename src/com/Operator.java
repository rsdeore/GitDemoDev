package com;

import java.util.Scanner;

public class Operator {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scanner.nextInt();
		System.out.println("Enter second number");
		int b=scanner.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a>>b;
		int h=a<<b;
		
		System.out.println("Addition of two numbers:"+c);
		System.out.println("Substraction of two numbers:"+d);
		System.out.println("Multiplication of numbers:"+e);
		System.out.println("Division of two numbers:"+f);
		System.out.println("Rightside operator  of two numbers:"+g);
		System.out.println("Leftside operator of two numbers:"+h);		
	}

}


//*********output*******************//
/*Enter first number
4
Enter second number
2
Addition of two numbers:6
Substraction of two numbers:2
Multiplication of numbers:8
Division of two numbers:2
Rightside operator  of two numbers:1
Leftside operator of two numbers:16*/