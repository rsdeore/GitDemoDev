package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hi GM");//input massage
    System.err.println("error");//error massage
    try {//FILE INPUT STREAM>>OPEN FILE
		FileInputStream fis=new FileInputStream("C:\\Users\\10635\\OneDrive - Expleo France\\Desktop\\Demo.txt");
	    Scanner scan=new Scanner(fis);//
	    while(scan.hasNextLine())
	    {
	    	System.out.println(scan.nextLine());
	    }
	    scan.close();
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
