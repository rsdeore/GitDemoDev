package com;

public class cheque {
	static int a=10;
	int b=10;//global variable
	
	public static void main(String[] args)
	{
		//cheque.x1();
		cheque student =new cheque();
		//cheque.x1();//by object creation
		System.out.println("static value a>>"+student.a++);//call static method
		System.out.println("Non-static value b>>"+student.b++);//non static method
		cheque student1 =new cheque();
		//cheque.x1();//by object creation
		System.out.println("static value a>>"+student1.a++);//call static method
		System.out.println("Non-static value b>>"+student1.b++);//non static method
		System.out.println("static value a>>"+student1.a++);//call static method
		System.out.println("Non-static value b>>"+student1.b++);//non static method
		
		
	}
	
	
}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=5;j++)
			
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(i+""+j);
			}
			System.out.println(j);
		}
	}
}
//System.out.println("Test");
		/*int num=1;
		switch(num)
		{
		case 0:
		{
			System.out.println("number is 0");
			break;
		}
		case 1:
		{
			System.out.println("number is 1");
			break;
		}
		case 2:
		{
			System.out.println("number is 2");
			break;
		}
		default:
		{
		     System.out.println(num);
		     break;
		}
		
}
	}
}*/
//access specifier

