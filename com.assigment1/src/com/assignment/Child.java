package com.assignment;

public class Child extends Parent {

	public void myProperty() {
		
		System.out.println("My property");

	}
	@Override
	public void land() {
		
		//super.land();
		System.out.println("My land");
	}

	@Override
	public void lambhorgini() {
		
		//super.lambhorgini();
		
		System.out.println("my car");

	}

	static  public void main(String ... ajith) {
		

		System.out.println("NORMAL OBJECT CREATION");
		Child c = new Child();
		c.lambhorgini();
		c.land();
		

//		c.lambhorgini();
//		c.helicopter();
		//c.myProperty();
		
		

//	

//		
////		
		System.out.println("UPCASTING");
		Parent p = new Child();

		p.lambhorgini();
		p.land();
		
		
		
		
		
		
		
		
		

//		System.out.println("PARENT CLASS OBJECT CREATION");
//
//	Parent pn = new Parent();
	//	pn.lambhorgini();
		
		

		// DOWNCASTING NOT POSSIBLE
		//Child cn =new Parent();

	}

}
