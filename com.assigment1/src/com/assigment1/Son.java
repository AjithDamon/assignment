package com.assigment1;

public class Son extends Daddy {
	
	//This is my own stuff
	public void mystuff() {
	System.out.println("This is my stuff");
	}
	public void bike() {
		System.out.println("Ducatti monster");
	}
	public void car() {
		System.out.println("Ferrari");
	}
	public void daddysstuff() {
		System.out.println("This is my daddy's stuff");
	}
	public void underline() {
		System.out.println("----------------------------------");
	}
	public static void main(String[]args) {
		
		Son s = new Son();
		s.mystuff();
		s.bike();
		s.car();
		//daddys stuff
		s.underline();
		s.daddysstuff();
		s.immovable_assets();
		s.immovable_assets1();
		s.immovable_assets2();
		s.immovable_assets3();
		
	}
	}


