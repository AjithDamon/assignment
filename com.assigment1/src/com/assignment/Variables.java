package com.assignment;

public class Variables {
	
	private static String s="class variable";
	
	

	private static void car() {
		
		 String st="local";

		System.out.println("car" + s);
		System.out.println("car" + st);
	}

	private void bike() {
		System.out.println("bike" + s);
	}

	public static void main(String[] args) {
		
		Variables v =new Variables();
		Variables.car();
		v.bike();
		

	}

}
