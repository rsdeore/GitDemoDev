//7.1. Design method to check whether the character is alphabet, digit and special symbol.

package com;

import java.util.Scanner;

public class CheckEnterInput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = scan.next().charAt(0);// .charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') 
		{
			System.out.println("This is a Character:");
		}
		else if (ch <= '9' && ch >= '0') 
		{
			System.out.println("This is number:");
		} else {
			System.out.println("This is special character");
		}
	}
}

//Enter the character:
//a
//This is a Character: