package com.programs;

import java.util.Scanner;

public class ToCheckPrimeOrNot {

	public static void main(String[] args) {
		
		
	
		
		
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		
		
		for(int n=i; n<=100; n++) {
			
			boolean flag=true;
			for(int j=2; j<n; j++) {
				
				
				if(j%n==0) {flag=false;}
			}
			
			if(flag==true) {System.out.println(i + " is a prime number");}
			else {System.out.println("not a prime number");}
			
		}

	}

}
