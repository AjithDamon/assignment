package com.assigment1;

public class Daughter extends Daddy {
	//This is my own stuff
		public void mystuff() {
		System.out.println("This is my stuff");
		}
		public void cycle() {
			System.out.println("LadyBird cycle");
		}
		public void Scooty() {
			System.out.println("Activa bike");
		}
		public void daddysstuff() {
			System.out.println("This is my daddy's stuff");
		}
		public void underline() {
			System.out.println("----------------------------------");
		}
		public static void main(String [] args) {
		
		Daughter d = new Daughter();
		
		d.mystuff();
		d.cycle();
		d.Scooty();
		d.underline();
		d.daddysstuff();
		d.movable_assets1();
		d.movable_assets2();
		d.movable_assets3();
		}
}
