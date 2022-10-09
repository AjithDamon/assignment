package com.assigment1;

public class Polymorphism {
	
	public void facebook1()
	{
	System.out.println("             Welcome to facebook       ");
	}

	public void facebook(String name, int name1) 
	{
	System.out.print("First Name  :"  +name);
	}
	
	public void facebook(String sur)
	{
	System.out.println("        Sur Name  :"  +sur);
	}
	
	public void facebook(long mob, String email) 
	{
	System.out.println("Mobile no/email address   :" + mob + "/" + email);	
	}
	
	public void facebook(int day, int month, int year)
	{
	System.out.println("Date of Birth  :" + day +"/" + month +"/" + year);
	}
	
	public void facebook(char gender)
	{
		System.out.println("Gender M/F  :" + gender);
	}
	
	public void facebook2() 
	{
		System.out.println("                SIGN UP      ");
	}
	public void facebook3()
	{
		System.out.println("By clicking signup you agree to our terms and conditions.");
	}
	public void facebook4()
	{
		System.out.println("                             ");
	}
	
	public static void main (String [] args)
	{
		Polymorphism p = new Polymorphism();
		p.facebook1();
		p.facebook4();
		p.facebook("Ajith", 0);
		p.facebook("Damon");
		p.facebook4();
		p.facebook(7299305294l, "ajithdamon@gmail.com");
		p.facebook4();
		p.facebook(9, 9, 1994);
		p.facebook4();
		p.facebook('M');
		p.facebook4();
		p.facebook3();
		p.facebook4();
		p.facebook4();
		p.facebook2();
	}
}
