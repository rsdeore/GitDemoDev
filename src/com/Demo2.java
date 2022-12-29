package com;

public class Demo2 extends Thread {

	//thread is smallest unit of programm
	//two way-1.by extednd thread class 2.implement the runnable interface
	//method-1.by extend thread class 
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
public static void main(String [] args)
{
	Demo2 td=new Demo2();
	td.start();//so back end 
}
}
