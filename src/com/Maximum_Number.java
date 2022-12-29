//5.3.write a program to find out maximum number among three number 
package com;

import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=scanner.nextInt();
		System.out.println("Enter the Second number");
		int b=scanner.nextInt();
		System.out.println("Enter the Thired number");
		int c=scanner.nextInt();
		if(a > b&&a > c)
		{
		System.out.println("A value is greater:"+a);
		
		}
		else if(b > a&& b > c )
		{
			System.out.println("B value is greater:"+b);	
		}
		else	
		{
			System.out.println("C value is greater:"+c);
		}
		
	}

}
/******Result********
Enter the First number
13
Enter the Second number
14
Enter the Thired number
15
C value is greater:15*/
