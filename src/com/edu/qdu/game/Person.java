package com.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	public void inputName() {
       Scanner input=new Scanner(System.in);
       String name=input.next();
       setPlayerName(name);
       }

	public int myFist() {
		Scanner input = new Scanner(System.in); 
		int number = input.nextInt(); 
		return number; 
	}
		public String askContinu() {
			Scanner input = new Scanner(System.in);
			String ret = input.next();
			return ret;
		}	

}

