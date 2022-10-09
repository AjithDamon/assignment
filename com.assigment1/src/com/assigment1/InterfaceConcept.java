package com.assigment1;

public class InterfaceConcept implements InterfaceTest1, InterfaceTest2 {
	


	
	@Override
	public void dog(String d) {
		System.out.println("What does dog do:  " + d);
		
	}
	
	@Override
	public void buffalo(int b) {
		System.out.println("HOw many buffaloes are in your farm:  " + b);
		
	}
	public static void main(String[] args) {
		InterfaceConcept i = new InterfaceConcept();
		
		i.buffalo(5);
		i.cat("hgj");
		i.elephant(null);
		i.dog("bark");
	}

	@Override
	public void elephant(String e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cat(String c) {
		System.out.println(c);
		
	}

}
