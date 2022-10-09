package com.assignment;

public class ParentConst {
	
	
	public ParentConst() {
		
		this(2);
		System.out.println("This is the firt constructor");
		
	}
	
	public ParentConst(int x) {
		
		this("final", 3);
		System.out.println("This is "+ x +" constructor");
		
	}
	
public ParentConst(String y,int x) {
		
		
		System.out.println("This is "+ x +" " + y+" constructor");
		
	}
	
	public static void main(String[] args) {
		
		 ParentConst p = new ParentConst();
		
		
		
	}

}
