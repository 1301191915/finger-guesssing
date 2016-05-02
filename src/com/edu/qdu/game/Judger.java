package com.edu.qdu.game;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Judger {
	private int total;
	//关联关系
	private Person person =new Person();
	private Computer computer =new Computer();
	public void startGame() {
		//游戏开始
		System.out.println("       *************");
		System.out.println("       **猜拳，开始**");
		System.out.println("       **************");
		//规则
		System.out.println("请出拳： 1.剪刀2.石头3.布");
	}
    public void askGame() {
		System.out.println("请选择对方角色（1.刘备2.孙权3.曹操）：");
		computer.inputName();
		System.out.println("请输入你的姓名：");
		person.inputName();
		System.out.println(Person.getPlayerName()+"vs"+Computer.getPlayerName()+"对战");
	}
    public void playGame() {
    	do{
    		
    		System.out.println("请"+person.getPlayerName()+"出拳：1.剪刀2.石头3.布（输入相应数字）：");
    		int num1=person.myFist();
    		System.out.println(Computer.getPlayerName()+"出拳：");
    		int num2=computer.myFist();
    		if (num1==num2) {
    			System.out.println("双方打平");
    		}else if(num1==1&&num2==2||num1==2&&num2==3||num1==3&&num2==1){
    			System.out.println(Computer.getPlayerName()+"赢");
    			person.setWinningTimes(person.getWinningTimes()+1);
			}else{
				System.out.println(person.getPlayerName()+"赢");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
    		total++; 
    		System.out.println("是否开始下一轮（y/n）");			  
    		ret=person.askContinu();
    	} while (ret.equals("y"));
	}

	public void finalResult() {
		System.out.println(Person.getPlayerName()+"vs"+Computer.getPlayerName());
		System.out.println("对战次数:" + total);
		System.out.println("姓名     "+" 得分" );
		System.out.println(Computer.getPlayerName() + computer.getWinningTimes());
		System.out.println(person.getPlayerName() + person.getWinningTimes());
	if (computer.getWinningTimes()==person.getWinningTimes()) {
		System.out.println("双方打平");
	}else if(computer.getWinningTimes()>person.getWinningTimes()){
		System.out.println("你输了！下次加油");
	}else{
		System.out.println("恭喜你赢了");
	}
	}
	public static void main(String[] args) {
		Judger j = new Judger();
		j.startGame();
		j.askName();
		j.playGame();
		j.finalResult();
	}
}
    		


