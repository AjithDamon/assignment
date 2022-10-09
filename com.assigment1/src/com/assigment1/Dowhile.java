package com.assigment1;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int n;
		do {
			System.out.println("Please enter a no greater than 100");
			n =sc.nextInt();
		} while(n<100);
		
		System.out.println("The no you entered is correct");

	}

}
