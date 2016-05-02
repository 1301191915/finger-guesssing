package com.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	public void inputName() {
	   String[] name={"Áõ±¸","ËïÈ¨","²Ü²Ù"};
	   Scanner input=new Scanner(System.in);
	   int i=input.nextInt();
	   setPlayerName(name[i-1]);
	}
	public int myFist(){
		return (int)(Math.random()*3)+1;
		
			
		}

}

