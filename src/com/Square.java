//5.7.Write the program to print the square of any number.
package com;

import java.util.Scanner;

public class Square {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of square");
		int  c= scanner.nextInt();
		int square=c*c;
		
		{
			System.out.println("number of square is:"+square);
		}
	}

}

/*output
Enter number of square
2
number of square is:4*/