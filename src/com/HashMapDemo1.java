package com;

import java.security.PublicKey;
import java.util.HashMap;

public class HashMapDemo1 {
int id=101;
String name="Rahul";
String salary="5000";
public static void main(String[] args)
{
	HashMap<HashMapDemo1, String> hm=new HashMap<HashMapDemo1, String>();
	HashMapDemo1 hashmapDemo1=new HashMapDemo1();
	hm.put(hashmapDemo1, hashmapDemo1.getSalary());
	System.out.println(hm.get(hashmapDemo1));
	System.out.println(hm);
}
@Override
public String toString() {
	return "HashMapDemo1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
}
