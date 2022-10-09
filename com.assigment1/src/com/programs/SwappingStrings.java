package com.programs;

public class SwappingStrings {

	public static void main(String[] args) {
		
		
		String s1= "Ajith";
		String s2= "Damon";
		
		System.out.println("Before swapping:" +s1+ " "+ s2);
		
		
		//logic
		
		String temp =s1;
		s1=s2;
		s2=temp;
		
		
		System.out.println("After Swapping:" +s1 +" " + s2);
		

	}

}
