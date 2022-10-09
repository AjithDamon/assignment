package com.assignment;

public class Stringtry {

	public static void main(String[] args) {
		
		 String str=new String("aWelacome tao java");
		 
		String s1= " Welcome to java and selenium  ";
		String s2= " Selenium ";
		//String s ="Welcome tof java";
		
		int len=str.length();
		System.out.println("Length:" +len);
		
		boolean equals=str.equals(s1);
		System.out.println("Equals:" + equals);
		
		boolean equalsIgnoreCase=str.equalsIgnoreCase(s1);
		System.out.println("EqualsIgnoreCase:" +equalsIgnoreCase);
		
		String Uppercase=s2.toUpperCase();
		System.out.println("Upper case:" + Uppercase);
		
		String Lowercase=s1.toLowerCase();
		System.out.println("Upper case:" + Lowercase);
		
		
	boolean startswith=str.startsWith("t"); 
	System.out.println("Starts with:" + startswith);
	
	boolean endwith=str.endsWith("java");
	System.out.println("Ends with:" + endwith);
	
	boolean contains=str.contains("Welacome");
	System.out.println("Contains:" + contains);
	
	int index=s1.indexOf("J");
	System.out.println("Index of:" + index);
	
	char char1=str.charAt(17);
	System.out.println("Character:" +char1);
	
	String substring=str.substring(10);
	System.out.println("Sub String:" + substring);
	
	String sub1=str.substring(0,1);
	System.out.println("Sub string 1:" + sub1);
	
	String replace=str.replace("tao", "selenium");
	System.out.println("replced:" + replace);
	
	String substring2 = s1.substring(11);
	System.out.println(substring2);
	
	String substring3 = s1.substring(0, 9);
	System.out.println(substring3);
	
	String[] split = s1.split(" ");
	
	
	for (String string : split) {
		System.out.println(string);
		
	}
	
	String trim = s1.trim();
	System.out.println(trim);
	
	
	
	
	

	}

}
