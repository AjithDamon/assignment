package com.assignment;

public class revereString {

	public static void main(String[] args) {

String s = "Welcome to java";
String rev = "";

//int len=s.length();

for(int i=s.length()-1; i>=0; i--)
	
{rev = rev + s.charAt(i);}

System.out.println("Your reverse string:"  + rev);
//System.out.println(len);

	}

}
