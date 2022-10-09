package com.assignment;

import java.util.Scanner;

public class ScannerLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no between 1 to 9 below");
		
		int s = sc.nextInt();
		
		if(s>=0 && s<=9) {
		
		for(int i=1; i<=10;i++) {
			
			for(int j=i; j<=10; j++) {System.out.print(" ");}
			
			for(int j =1; j<i; j++) {System.out.print(s);}
			
			
			for(int j =1; j<=i; j++) {System.out.print(s);}
			
			System.out.println();
		}}
		else {System.err.println("Please Enter a no between 1 to 9");}

	}

}
