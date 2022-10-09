package com.assignment;

public class StringCheck {


		String s = "welcome94 to02 java55";
		
		
		
		public void toAddNosOnly() {
			
			
			
			//TO ADD THE NUMBERS ALONE  IN A STRING
		String substring = s.substring(7, 9);
		System.out.println("FIRST NO:  " +substring);
		
		String substring1 = s.substring(12, 14);
		System.out.println("SECOND NO:  " +substring1);
		
		String substring2 = s.substring(19, 21);
		System.out.println("THIRD NO:  " +substring2);
		
		
		
		//CONVERTING STRING TO INTEGER
		
	
		
		int parseInt1 = Integer.parseInt(substring);
		
		
		int parseInt2 = Integer.parseInt(substring1);
		
		
		int parseInt3 = Integer.parseInt(substring2);
		
		//NOW ADDING ALL THE INTEGERS
		
		int Total = parseInt1 + parseInt2 + parseInt3;
		
		System.out.println("SUM OF ALL NOS:  " +Total);}
		
		public void toPrintNosOnly() {
			
			
			for(int i=0; i<s.length(); i++) {
				
				if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					
					System.out.print(s.charAt(i));}
					
				}
				
		}
			
		public static void main(String[] args) {
			
			StringCheck s = new StringCheck();
			
			s.toAddNosOnly();
			System.out.println("*********************************************");
			s.toPrintNosOnly();
	}

}
