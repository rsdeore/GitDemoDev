//7.4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
package com;

import java.util.Scanner;

public class ReverseNum {

	
	public int getReverseNuber(int num)
	{
		int r,sum=0;
		while(num>0)
		{
			r=num%10;
			sum= (sum * 10) +r;
			num =num /10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter number to find reverse:");
  int num=scan.nextInt();
  scan.close();
  ReverseNum reversenum=new ReverseNum();
  System.out.println(num+"reverse is"+ reversenum.getReverseNuber(num));
}

}
