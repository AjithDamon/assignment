package com.programs;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		
		
		//TO PRINT ODD NUMBERS
		
		System.out.println("ODD NUMBERS");
		
		for(int i=1; i<=20; i ++){
			
			if(i%2==0) {continue;}
			
			
			System.out.println(i);
			
		}
		
		//TO PRINT EVEN NUMBERS
		System.out.println("===============================================");
		System.out.println("EVEN NUMBERS");
		
		for(int i=1; i<=20; i++) {
			
			
			if(i%2!=0) {continue;}
			
			System.out.println(i);
		}

	}

}
