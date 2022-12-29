package com;

public class Array {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int b[]=new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;*/
		
		
		/*System.out.println(b.length);
		//first way
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]);
		//int b[];
		}*/
	String str=" Pune ";
	System.out.println(str.toUpperCase());
	System.out.println(str.length());
	System.out.println(str.charAt(1));
	//System.out.println(str.);
	
	
String b[]= {"R","V","k"};
String s="Rahul";//immutable>>String Literal
s.concat("Pawar");//append scp string constant pool(SCP)
String s1="Rahul";
String s2="Rahul";
System.out.println(s1==s2);
String s3="Rahul";
String s4="Rahul";
String s5=new String("RAHUL");//heap memory madhe store 2 obj scp ---heap area and pool area 
String s6=new String("Rahul");
System.out.println(s4);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s5);
System.out.println(s1==s5);
System.out.println(s1.equals(s5));//string constant jvm madhe check karto and heap area madhe 
System.out.println(s1=s2);
System.out.println(s2.hashCode());//
System.out.println(s1.hashCode());
System.out.println(s5==s6);//false
System.out.println(s5.equals(s6));//true
System.out.println(s5.hashCode());
System.out.println(s6.hashCode());
//refernce dycha aseltar no problem
//for (String i:b)//data types 
	
//{
	//System.out.println(i);
//}
	}
}
