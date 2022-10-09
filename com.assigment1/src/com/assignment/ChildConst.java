package com.assignment;

public class ChildConst extends ParentConst{
	
	
	
	
	public ChildConst() {
		
		super(5);
		System.out.println("This is Child Constructor");
	}

	public static void main(String[] args) {
		
		new ChildConst();
		
		

	}

}

