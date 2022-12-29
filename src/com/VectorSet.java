package com;
import java.util.Stack;
import java.util.Vector;

public class VectorSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vector v=new Vector(); for(int i=1;i<=10;i++) { v.addElement(i); }
		 * System.out.println(v.capacity()); v.add(11);
		 * System.out.println(v.capacity()); System.out.println(v);
		 * System.out.println(v.get(5));
		 */
		Stack st=new Stack();
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		System.out.println(st);
		System.out.println(st.peek());//remove D Element
		System.out.println(st);
		System.out.println(st.pop());//remove 
		System.out.println(st);
		System.out.println(st.peek());//remove D Element
		System.out.println(st);
		
}

}
