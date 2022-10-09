package com.programs;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		//int count;
		
		
		int arr[]= {2,3,2,2,3,4,5};
		
		
		for(int i=0; i<arr.length;i++) {
			
			
			int count=0;
			
			for(int j=i+1; j<arr.length; j++) {
				
				
				if(arr[i]==arr[j]) {count ++;}
				
				
				
				
			}
			
			
			
			
			
			if(count==0) {System.out.print(arr[i]);}
			
			
		}

	}

}
