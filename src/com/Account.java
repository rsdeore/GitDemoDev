package com;

public class Account {
	
	static int balance=5000;
	public int balance()
	{
		return balance;
	}
public void withdraw(int amt) throws regen
	{
		if(amt>balance)
		{
		throw new regen("Insuff Balance in Account:");
		}
		else
		{
		balance=balance-amt;
		}
	}
	
	
//public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

}
