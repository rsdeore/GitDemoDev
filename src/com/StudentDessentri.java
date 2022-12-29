package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDessentri {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
try {
	FileInputStream fis=new FileInputStream("C:\\Users\\10635\\OneDrive - Expleo France\\Desktop\\Demo.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	Student12 s=(Student12) o;
	System.out.println(s.firstName);
	System.out.println(s.lastName);
	System.out.println(s.city);	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}


//Ram
//Patil
//Pune
