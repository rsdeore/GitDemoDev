package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class traffic234 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Student12 student=new Student12();
student.firstName="Ram";
student.lastName="Patil";
student.city="Pune";

try {
	FileOutputStream fos=new FileOutputStream("C:\\Users\\10635\\OneDrive - Expleo France\\Desktop\\Demo.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(student);
	System.out.println("Recode inserted succesfully......");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	}

}
