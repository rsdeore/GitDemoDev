//2.6.Write the Java Program to Print the global variable value as 25-

package com;

public class VMWare {
	int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   VMWare globalvar=new VMWare();
   {
	   System.out.println("Global Variable y>>"+globalvar.y);
   }
	}

}


//**Output**
//Global Variable y>>0
