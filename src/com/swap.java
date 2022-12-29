//5.8.Write a program to swap the two numbers.
package com;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner test=new Scanner(System.in);
System.out.println("Enter the a");
int a=test.nextInt();
System.out.println("Enter the b");
int b=test.nextInt();
//System.out.println("Enter the c");
int c;
{
System.out.println("Before swapping numbers are a: " + a + " and b: " + b);
}
c=a;
a=b;
b=c;
{
System.out.println("After swapping numbers are a: " + a + " and b: " + b);
}

	}

}

/*OUTPUT NUMBER
 Enter the a
10
Enter the b
20
Before swapping numbers are a: 10 and b: 20
After swapping numbers are a: 20 and b: 10*/