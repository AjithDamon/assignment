package com.assigment1;

public class Statics {
	
    static int money;
	
	String name;

	
	public static void main(String[] args) {
	
		
		Statics s =new Statics();
		
		s.money=100;
		s.name="Ajith";
		System.out.println(s.name + money);
		
		s.money=200;
		System.out.println(money);
		
	}
}
