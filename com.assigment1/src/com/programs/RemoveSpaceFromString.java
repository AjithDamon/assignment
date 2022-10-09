package com.programs;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		
		
		String s ="Welcome To Java";
		
		String[] split = s.split(" ");
		
		for (String string : split) {
			
			System.out.print(string);
			
			
		}

	}

}
