package com.assigment1;

public class Method_Overriding_Parent {
	
	 void name(String name) {
		System.out.println("Name1    :"  +name);
	}
	public void age(int age) {
		System.out.println("Age   :"  + age);
	}
	
	public void dob(int no, int no1,  int no2) {
		System.out.println("DOB   :" + no+ "/" +no1 +"/" +no2);
	}
	
	public static void main (String [] args) {
		Method_Overriding_Parent M = new Method_Overriding_Parent();
		
		M.name("Ajith Raj");
		M.age(27);
		M.dob(9, 9, 1994);
	}

}
