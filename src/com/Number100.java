
//5.6.Write the program to check whether the no is greater than 100.

package com;

import java.util.Scanner;

public class Number100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (number > 100) {
			System.out.println("Number is more than 100");

		} else {
			System.out.println("Number is less than 100");

		}

	}

}

/*
 * Enter a number 123 Number is more than 100
 */