package com.assigment1;

public class ExceptionHand {

	public static void main(String[] args) {


		try {
			
			String num = null;
			System.out.println(num.length());
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("Handled");
		}
		
		
	}

}
