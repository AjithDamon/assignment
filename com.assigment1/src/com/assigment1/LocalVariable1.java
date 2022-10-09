package com.assigment1;

public class LocalVariable1 {
	
	int i=67;
	int h = 98;
	String s;
	boolean b;
	
	public void check() {
		
		//int i = 10;
		//boolean b = false;
		
		System.out.println(i + h);
		
		
	}
	
	public void check1() {
		
		System.out.println(s);
	}
	
	public static void main(String[]args) {
	LocalVariable1 l = new LocalVariable1();
	l.check();
	l.check1();
	}
		
	}


