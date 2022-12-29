package com;

public class Test_Declare2 extends Test_Declare {
   //int a=50;
    void demo()
    {
    	int a=100;
    	//Test_Declare2 test3=new Test_Declare2();
    	System.out.println("This is Test_Declare3 method");
    	//System.out.println(test3.a);//instance variable
    	//System.out.println(this.a);//instance variable
    }
    void demo1()
    {
    	//Test_Declare2 test3=new Test_Declare2();
        //test3.demo();
        this.demo();
        super.demo();
        System.out.println();
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Declare2 test3=new Test_Declare2();
        test3.demo1();
	}

}
