package com.assigment1;

public class Method_Overriding_Child1 extends Method_Overriding_Parent {
	
	@Override
	public void name(String name) {
		// TODO Auto-generated method stub
		super.name(name);
	}
	@Override
	public void age(int age) {
		// TODO Auto-generated method stub
		super.age(age);
	}
	
	@Override
	public void dob(int no, int no1, int no2) {
		// TODO Auto-generated method stub
		super.dob(no, no1, no2);
	}
	

	
  public static void main (String [] args) {
	  Method_Overriding_Child1 o = new Method_Overriding_Child1();
	  o.name("Ajith Raj");
	  o.age(27);
	  o.dob(9, 9, 1994);
  }
}

