package com;

public class student1 {
	
	private int rollNo;
	{
		
	}
	public int getrollNo() {
		return rollNo;
	}
	public void setrollNo(int No) {
		if(No>0)
		{
			rollNo=No;
		}
		else
		{
			rollNo=0;
			System.out.println("Roll Number canot be -ve");
		}
	}
	public static void main(String[]args)
	{
		student1  a=new student1();
		a.setrollNo(-12);
		
	}
}
