package com.assigment1;

public class ThrowCheck {
	
	
	
	public void ajith(int num) throws ArithmeticException, NullPointerException{
		
		
		System.out.println(num);
		
		throw new ArithmeticException("Exception trying");
			
		
		
		
	}

	public static void main(String[] args) {
		
		
		ThrowCheck t=new ThrowCheck();
		
		t.ajith(2);

	}

}
