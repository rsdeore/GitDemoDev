//5.4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case
package com;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String a="jun";
		// int January=1;
		// int Feb=2;
		// int March=3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month of year");
		String a = scanner.next();
		switch (a) {
		case "Jan":
			System.out.println("January month");
			break;
		case "Feb":
			System.out.println("Feb month");
			break;
		case "Mar":
			System.out.println("Mar month");
			break;
		case "April":
			System.out.println("April month");
			break;
		case "May":
			System.out.println("May month");
			break;
		case "Jun":
			System.out.println("June month");
			break;
		case "July":
			System.out.println("July month");
			break;
		case "Auguest":
			System.out.println("Augu month");
			break;
		default:
			System.out.println("Wrong month of year selected");
		}
	}

}
/****
 * output- Enter the month of year 12 Wrong month of year selected
 */
