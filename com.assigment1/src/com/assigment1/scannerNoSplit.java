package com.assigment1;

import java.util.Scanner;

public class scannerNoSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name below;");
		
		String s=sc.nextLine();
		
		//------------------------------------------------------------------
		
		String Rev=" ";
		
		for(int i = s.length()-1; i>=0; i--)
		
		{
			char charat=s.charAt(i);
			
			Rev=Rev+charat;
		}
		System.out.println(  Rev);

	}

}
