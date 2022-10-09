package com.programs;

public class Reverse_A_Number {

	public static void main(String[] args) {
		
		
		int no=123456789;
		
		//converting integer to string
		String s1 = String.valueOf(no);
		
		System.out.println(s1);
		
		
		for(int i=s1.length()-1; i>=0; i--) {
			
			System.out.print(s1.charAt(i));
		}
	}

}
