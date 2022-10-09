package com.assigment1;

import java.util.Scanner;

public class BankDetails {
	
	
	public void ajith() {
		
		System.out.println("NAME: R.Ajith Raj");
		System.out.println("Branch: SBI");
		System.out.println("AC NO:  3434334343");
		
	}
public void ganga() {
		
		System.out.println("NAME: ganga");
		System.out.println("Branch: RBI");
		System.out.println("AC NO:  3434334343");
		
	}
public  void arya() {
	
	System.out.println("NAME: arya");
	System.out.println("Branch: CUB");
	System.out.println("AC NO:  3434334343");
	
}
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		BankDetails b=new BankDetails();
		
		
		System.out.println("Enter a name to get bank details");
		System.out.println("Choose from ajith,ganga,arya");
		
		String name = sc.next();
		
		
		if(name.equals("ajith")) {b.ajith();}
		else if(name.equals("arya")) {b.arya();}
		else if(name.equals("ganga")) {b.ganga();}
		else {System.err.println("THE NAME YOU ENTERED " + name + " IS NOT FOUND");}
	}

}
