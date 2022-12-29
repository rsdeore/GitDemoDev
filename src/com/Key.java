package com;

import java.util.Scanner;

public class Key {


		// TODO Auto-generated method stub
		public int getNumberCube(int num) {
			return (num * num * num);
		}

		public static void main(String[] args) {
			// Design method public int getNumberCube(int num), return int value to that
			// method and result should be into main method.
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number to find cube: ");
			int num = scan.nextInt();
			scan.close();
			Key numCube = new Key();
			System.out.println(num + " cube is " + numCube.getNumberCube(num));

		}

	

	}

