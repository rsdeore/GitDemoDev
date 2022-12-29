//3.1.Design the separate method as String getStudentName (String name) which return the student name and print it.

package com;

public class Citrix {
//int x=25;
//public static void student()//
	String getStudentName(String rahul)
	{
		return rahul;
		
	}
	//public void student()
//{
	//System.out.println("I am in pune");
//}

	public static void main(String[] args) {
		Citrix Cit=new Citrix();
		String s=Cit.getStudentName("rahul");
		System.out.println("student name>>"+s);
		//static keyword-
		//Cit.student();by using object
		//Citrix.student();by using class
		//student();by using method
		
		//non-static keyword-
		//Cit.student();//by using object
		//Citrix.student();
		
		
		// TODO Auto-generated method stub
		//VMWare test=new VMWare();
		//System.out.println("VMware class y>>"+test.y);
		//Citrix test1=new Citrix();
		//System.out.println("Citrix class x>>"+test1.x);
	}

}

//*****output****
//student name>>rahul