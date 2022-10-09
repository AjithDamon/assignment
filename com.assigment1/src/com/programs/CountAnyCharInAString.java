package com.programs;

public class CountAnyCharInAString {

	public static void main(String[] args) {
		
		String s = "Malayalam is good";
		
		char search ='a';
		
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(search==s.charAt(i)) {
				count++;
				}
			}
		System.out.println("Count of char" +" "+ search+ " "+ "in"+" " + s +" "+ "is"+ " " +count);
	}

}
