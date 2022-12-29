package com;

public class Coreconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2= {2,4,5,6};
		//check array has multiple of 2
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;//exist if condition met
			}
			else
			{
				System.out.println("False");
			}
		}
	}

}
