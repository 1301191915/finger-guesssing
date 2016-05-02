package com.edu.qdu.game;

public abstract class Player {
	private  String playerName;
	private  int winningTimes;

	public abstract void inputName(); 

	

	public abstract int myFist(); 

	

	public static String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getWinningTimes() {
		return winningTimes;
	}

	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}

}