package com;

public class Arrays_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int [5];
arr[0]=1;
arr[2]=2;
arr[3]=3;
arr[4]=5;
int[] arr2= {2,4,5,6};
//System.out.println("array is"+arr2[2]);
for(int i=1;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
String[] name={"rahul","Shetty","Selenium"};
{
	System.out.println(""+name[1]);
}
for (String s: name)
{
	System.out.println(s);
}
}

}
