package com.assignment;

public class ChromeDriver implements WebDriver {
	
	@Override
	public void navigate() {
		
		System.out.println("to navigate");
		
	}

	@Override
	public void get() {
		System.out.println("to get webpage");
		
	}
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate();

	}

	

}
