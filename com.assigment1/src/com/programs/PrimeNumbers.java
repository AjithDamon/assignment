package com.programs;

public class PrimeNumbers {

	public static void main(String[] args) {

		int i, j;
		int count=0;

		for (i = 1; i <= 100; i++) {
		
			boolean flag = true;
			for(j=2; j <i; j++) {
				
				if(i%j==0) {
					
					flag=false;
				}
				
				
			}
			
if(flag==true) {System.out.println(i +" is a prime number") ; count++;
}

		}System.out.println(count);
	}

}
