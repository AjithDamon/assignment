package com.assigment1;

import java.util.Scanner;

public class Scannertry1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter marks below as asked");
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Please enter marks obtained for english");
		int english = sc.nextInt();
		System.out.println("ENGLISH:"  + english);
		
		System.out.println("Please enter marks obtained for tamil");
		int tamil=sc.nextInt();
		System.out.println("TAMIL:"  + tamil);
		
		System.out.println("Please enter marks obtained for science");
		int science=sc.nextInt();
		System.out.println("SCIENCE:"  + science);
		
		System.out.println("Please enter marks obtained for sanskrit");
		int sanskrit=sc.nextInt();
		System.out.println("SANSKRIT:"  + sanskrit);
		
		System.out.println("Please enter marks obtained for maths");
		int maths=sc.nextInt();
		System.out.println("MATHS:"  + maths);
		
		int Total= english +tamil + science + sanskrit + maths;
		int Average;
		//Total = english +tamil + science + sanskrit + maths;
		Average = Total/5;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Your total marks obtained:" + Total +"/500");
		System.out.println("Your Average is:" + Average);
		System.out.println("-----------------------------------------------------------");
	if(Average < 40) 
	{System.err.println("Sorry bro you are failed");}
	else if(Average >=40 && Average <50) {System.out.println("Your Grade: E Grade");}
	else if(Average >=50 && Average <60) {System.out.println("Your Grade: D Grade");}
	else if(Average >=60 && Average <70) {System.out.println("Your Grade: C Grade");}
	else if(Average >=70 && Average <80) {System.out.println("Your Grade: B Grade");}
	else if(Average >=80 && Average <90) {System.out.println("Your Grade: A Grade");}
	else {System.out.println("Your Grade: A Grade");
	
	
	}

}
}
