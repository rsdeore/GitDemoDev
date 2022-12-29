//5.3.write a program to find out maximum number among three number 
package com;

import java.util.Scanner;

public class condition {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the year");
int Year=scanner.nextInt();
//System.out.println("Enter second number");
//int b=scanner.nextInt();
if(Year%4==0)
{
	System.out.println("Year is leap");
}
else
{
	System.out.println("Year is not leap");
}

	}

}


/*****output*******
Enter the year
2024
Year is leap*/
