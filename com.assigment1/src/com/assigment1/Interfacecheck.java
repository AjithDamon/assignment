package com.assigment1;

public class Interfacecheck implements InterfaceTest1{
	
	
	
	int i []= new int[5];

	@Override
	public void dog(String d) {
		System.out.println("DOG:" + d);	
	}

	@Override
	public void cat(String c) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) {
		Interfacecheck i = new Interfacecheck();
		i.cat(null);
		i.dog("dsdsd");

	}

	
	
	
	
	

}
