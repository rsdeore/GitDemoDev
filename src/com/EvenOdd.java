//5.Write a program to check whether number is even or odd.

package com;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  a number");
		int a = scanner.nextInt();
		if (a % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}

	}

}
/*
 * OUTPUT**** Enter a number 100 number is even
 */