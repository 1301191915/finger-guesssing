package com.edu.qdu.game;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Judger {
	private int total;
	//������ϵ
	private Person person =new Person();
	private Computer computer =new Computer();
	public void startGame() {
		//��Ϸ��ʼ
		System.out.println("       *************");
		System.out.println("       **��ȭ����ʼ**");
		System.out.println("       **************");
		//����
		System.out.println("���ȭ�� 1.����2.ʯͷ3.��");
	}
    public void askGame() {
		System.out.println("��ѡ��Է���ɫ��1.����2.��Ȩ3.�ܲ٣���");
		computer.inputName();
		System.out.println("���������������");
		person.inputName();
		System.out.println(Person.getPlayerName()+"vs"+Computer.getPlayerName()+"��ս");
	}
    public void playGame() {
    	do{
    		
    		System.out.println("��"+person.getPlayerName()+"��ȭ��1.����2.ʯͷ3.����������Ӧ���֣���");
    		int num1=person.myFist();
    		System.out.println(Computer.getPlayerName()+"��ȭ��");
    		int num2=computer.myFist();
    		if (num1==num2) {
    			System.out.println("˫����ƽ");
    		}else if(num1==1&&num2==2||num1==2&&num2==3||num1==3&&num2==1){
    			System.out.println(Computer.getPlayerName()+"Ӯ");
    			person.setWinningTimes(person.getWinningTimes()+1);
			}else{
				System.out.println(person.getPlayerName()+"Ӯ");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
    		total++; 
    		System.out.println("�Ƿ�ʼ��һ�֣�y/n��");			  
    		ret=person.askContinu();
    	} while (ret.equals("y"));
	}

	public void finalResult() {
		System.out.println(Person.getPlayerName()+"vs"+Computer.getPlayerName());
		System.out.println("��ս����:" + total);
		System.out.println("����     "+" �÷�" );
		System.out.println(Computer.getPlayerName() + computer.getWinningTimes());
		System.out.println(person.getPlayerName() + person.getWinningTimes());
	if (computer.getWinningTimes()==person.getWinningTimes()) {
		System.out.println("˫����ƽ");
	}else if(computer.getWinningTimes()>person.getWinningTimes()){
		System.out.println("�����ˣ��´μ���");
	}else{
		System.out.println("��ϲ��Ӯ��");
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
    		


