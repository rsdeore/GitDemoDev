package com;

import java.util.Scanner;

public class mainAcc {

public static void main(String[] args) throws regen
{
	String action;
	do
	{
		// TODO Auto-generated method stub
		Account account=new Account();
		System.out.println("Current account balance="+account.balance());
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount to be withdraw");
        int amount =scan.nextInt();
        account.withdraw(amount);
        System.out.println("balance remaining="+account.balance());
        System.out.println("if you want to continue then press (Y) if no then(N)");
        action=scan.next();
     
}while(action.equals("Y") || action.equals("y"));
{ 
	
}
}

}
