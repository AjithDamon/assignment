package com.assigment1;

import java.util.Scanner;

public class Scannertry {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println();
		System.out.println("********************************************************************");
		System.out.println();
		System.out.println("                          FACEBOOK SIGNUP       ");
		System.out.println();
		System.out.println();
		System.out.print("Enter your Username:      ");
		
		String UserName= myObj.nextLine();
		
		
		
		System.out.print("Enter Your New Password:     ");
		String pwd = myObj.nextLine();
		
		System.out.print("Confirm your Password:      ");
		String pwd1 = myObj.nextLine();
		
		System.out.print("Enter your age:     ");
		int age = myObj.nextInt();
		
		System.out.println("Enter a name:   ");
		char charAt = myObj.next().charAt(2);
		System.out.println(charAt);
		myObj.close();
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("====================================================================");
		System.out.println("                  Your username is:  "  +   UserName);
		System.out.println();
		System.out.println("                  Your Password is:  "+   pwd);
		System.out.println("====================================================================");
		System.out.println();
		System.out.println("                                SIGNUP     ");
	}

}
