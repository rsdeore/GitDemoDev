package com;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= " Happy New Year ";
int count =0;
for(int i=0; i< s.length();i++)
{
	char ch =s.charAt(i);
	if (ch == ' ')
	{
		count++;
	}
	
	//System.out.println("total space"+count);
}
System.out.println("total space>>"+count);
System.out.println("total space>>"+count);
	}

}
