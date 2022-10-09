package com.programs;

public class DuplicatesInArray {

	public static void main(String[] args) {

String arr[]= {"ajith", "Vijay","Rajini", "Vijay", "Ajith"};

int count=1;
String Duplicate="";


 //TO PRINT DUPLICATES IN AN ARRAY

for(int i=0; i<arr.length; i++)
     {
	
	 for(int j=i+1; j<arr.length;j++) {
		 if(arr[i]==arr[j]) {
			 
			// System.out.println(arr[i]);
			 count++;
			 Duplicate=arr[i];
		 }
		 
	 }
	
     }System.out.println(count);
     System.out.println(Duplicate);

	}

}
