package com.assignment;

public class split {

	public static void main(String[] args) {
		String s = "Welcome to java";
		
		String s1[]=s.split(" ");
		
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		
		String reversestring=" ";
		
		for (String w : s1) {
			
			String reverseword=" ";
			
			for(int i=w.length()-1; i>=0; i--) {
				reverseword=reverseword + w.charAt(i);
			}
			
			//System.out.print(reverseword);
			reversestring=reversestring +reverseword+" ";
		}
		System.out.println(reversestring);

	}

}
