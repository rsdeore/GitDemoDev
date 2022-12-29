package com;

import java.io.FileWriter;
//import java.io.FileWriter;
//import java.io.FilterWriter;

public class WriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
    FileWriter fw= new FileWriter("C:\\Users\\10635\\OneDrive - Expleo France\\Desktop\\Demo.txt");
    fw.write("welcome to expleo>>>>");
    fw.close();
	}
	catch (Exception e)
	{
	e.printStackTrace();	
	}
	System.out.println("Sucess>>>>");

}
}
