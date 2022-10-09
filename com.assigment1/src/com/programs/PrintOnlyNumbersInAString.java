package com.programs;

public class PrintOnlyNumbersInAString {
		
	//TO PRINT ONLY NUMBERS
		
		public void onlyNumbers() {
			String s = "Hi Ajith 94 welcome to chennai 600050";
	
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			
			{System.out.print(s.charAt(i));
			
			}
			}
		}
		
		
    //TO PRINT ONLY ALPHABETS
	
	public void onlyAlphabets(){
		System.out.println();   //this syso is just for bringing the next line down
		String s = "Hi Ajith 94 welcome to chennai 600050";
	for(int i=0; i<s.length(); i++) {
		
		if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			System.out.print(s.charAt(i));}
		else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
			System.out.print(s.charAt(i));
		}
		}
	}
	 static public void main(String[] args) {
		PrintOnlyNumbersInAString p =new PrintOnlyNumbersInAString();
		p.onlyNumbers();
		p.onlyAlphabets();
	}
	}
