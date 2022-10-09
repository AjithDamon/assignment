package com.assigment1;

import java.util.Scanner;

public class ScannerForLoop {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter no from 1 to 9 for printing star");
		int user = sc.nextInt();
		
		
		for(int i=0; i<10; i++) {
			for(int j=i; j<10; j++) {
				System.out.print("  ");}
			
			for(int j=0; j<i; j++) {
				System.out.print(user+" ");}
			
			for(int j=0; j<=i; j++) {
				System.out.print(user+ " ");}
			
			
			
			System.out.println();
			}
			
			
			
		}
		
	
			
			
			
			
			
			
			
			
		}
