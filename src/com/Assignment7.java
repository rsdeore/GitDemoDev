//2. Design method public int getNumberCube(int num), return int value to that method and result should be into main method.
package com;

import java.util.Scanner;

public class Assignment7 {
	//public class num1{

		public  int getnum(int num) {
			// TODO Auto-generated method stub
			return (num * num * num);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find cube: ");
		int num = scan.nextInt();
		scan.close();
		Assignment7 num2 = new Assignment7();
		System.out.println(num + " cube is " + num2.getnum(num));
		
	}

}

//output of programm-
//Enter number to find cube: 
//3
//3 cube is 27
