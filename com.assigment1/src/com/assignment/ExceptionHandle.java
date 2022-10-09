package com.assignment;

public class ExceptionHandle {
	
	
	
	public void Check() {
		
		int num=5;
		int num1=0;
		
		String s="Ajith";
		
		try {
		int num2=num/num1;
		System.out.println(num2);}
		
		catch(Exception e) {
			
			System.out.println("Arithmetic exception handled");
		}
		
		try {
		System.out.println(s.charAt(6));}
		catch(Exception e) {
			
			System.out.println("String Index out of bound exception handled");
		}
		
		finally{System.out.println("Given String: " +s);}
		
		System.out.println(num);
		
		
	}

	public static void main(String[] args) {
		

		ExceptionHandle eh=new ExceptionHandle();
		
		eh.Check();
	}

}
