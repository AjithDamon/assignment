package com.programs;

import java.util.Scanner;

public class CheckArmstrongNumber {

	

	public static void main(String[] args) {

		
		int a,i,j=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number below");
		int n = sc.nextInt(); 
		
		a=n;
		
		while(a>0) {
			i=a%10;
			System.out.println(i);
			j=j + (i*i*i);
			System.out.println(j);
			a=a/10;
			System.out.println(a);
			
		}
		
		if(n==j) {
			System.out.println("This is a Armstron no");
		}else {System.out.println("Not a Armstrong No");}

	}

}
