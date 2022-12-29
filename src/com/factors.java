//7.4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.

package com;

import java.util.Scanner;

public class factors {

	public static void getFactorsNum(int num)
	{
		for(int i=1;i<=num;i++)
			if(num%i==0)
				System.out.println(i+ " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		scan.close();
		System.out.println("Enter number facotrs are:");
		getFactorsNum(num);

	}

}

//output
//Enter the number
//20
//Enter number facotrs are:
//1 
//2 
//4 
//5 
//10 
//20 