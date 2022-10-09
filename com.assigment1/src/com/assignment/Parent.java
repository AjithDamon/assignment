package com.assignment;

public class Parent {

	public void lambhorgini() {
		System.out.println("daddy car");
	}

	public void helicopter() {
		System.out.println("Thia is my helicopter");

	}

	public void land() {
		System.out.println("daddy land");

	}

	public static void main(String[] args) {
		
//		Child c = new Child();
//		c.lambhorgini();
//		c.land();
		
		
		Parent p = new Child();

		p.lambhorgini();
		p.land();
		
		
		
		
		

	}

}
