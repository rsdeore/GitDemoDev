package com;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1st line");
		System.out.println("2nd line");
		try {
		int a=10/0;
		}
		catch(Exception e)//type of exception>>thorowable
		{
		System.out.println(e);	
		} 
		catch (Throwable t)
		{
			System.out.println(t);	
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("3rd line");
		System.out.println("4th line");
	}

}
