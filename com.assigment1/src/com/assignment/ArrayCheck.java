package com.assignment;

public class ArrayCheck {

	public static void main(String[] args) {
		
		
		String arr[] ={"ajith","vijay","rolex","ajith","vijay"};
		
		
		
		
		for(int i=0; i<arr.length; i++) {
			
			
			int count=0;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {count++;}
				
				
				
			}
			
			
			
			if(count==0) {System.out.print(arr[i]+ ",") ;}
			
			
			
		}

	}

}
