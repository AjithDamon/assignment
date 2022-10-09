package com.programs;

public class StringReverseEachWord {

	public static void main(String[] args) {
		
		String s ="Welcome to java";
		
		String[] split = s.split(" ");
		
		String reversestring ="";
		
		
		for (String w : split) { 
				
			
			String reverseword="";
			
			for(int i=w.length()-1; i>=0; i--) {
				
				reverseword=reverseword + w.charAt(i);
				
				
			}
			
			reversestring=reversestring + reverseword + " ";
			
			
			
		}
		System.out.println(reversestring);
		
		
		

	}

}
