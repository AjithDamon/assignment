package com.assignment;

import java.util.Iterator;
import java.util.Scanner;

public class scannerSplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter something below");
		
		String s=sc.nextLine();
		
		System.out.println("You entered:" + s);
		
		
		String split[]=s.split(" ");
		
		String rev= " ";
		
		for (String foreach : split) {
			
			String rev1=" ";
			
			for(int i = foreach.length()-1; i>=0; i--) {
				
				rev1=rev1+foreach.charAt(i);
			}
			
			rev=rev+rev1+" ";
			
				}
		
		System.out.println("Your reversed string is:" +rev);
	}
	

}
