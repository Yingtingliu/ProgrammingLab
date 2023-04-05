package Prog.temp;

import java.util.Scanner;

public class Player {
	Board board;
	String name;
	int score;	
	
	//constructor
	public Player(Board board, String name) {
		this.board = board;
		this.name = name;		
	}
	
	public boolean takeTurn(Board board,Player player, Square[][] gameboard,BattleShip[] battleShipArray) {
		//print the board
		board.toString(board,gameboard);
		board.toStringViewShip(board,gameboard);		
		
		//Use scanner to get player's input
		String temp, firstWord, secondWord;
		System.out.println("Hi " + player.name + ", please enter the position x y from 0-9, eg: 0 1");
		Scanner in = new Scanner(System.in);
		temp = in.nextLine();
		in = new Scanner(temp);
		//extract input to two words
		firstWord = in.next(); 
		secondWord = in.next();
		int row = Integer.valueOf(firstWord);
		int column = Integer.valueOf(secondWord);		
		
		// hit the square		
		if(gameboard[row][column].isShipInSquare()) {
			//if there's ship, get the battle ship number
			int battleShipNumber = gameboard[row][column].getBattleShipNumber();
			// check current health number
			int currentHealth = battleShipArray[battleShipNumber].getHealth();
			battleShipArray[battleShipNumber].setHealth(currentHealth-1);
			//if the current health number is 1, deduct the number and set it as sink
			if(currentHealth==1) { 
				battleShipArray[battleShipNumber].setSunk(true);
			} 			
		} 
		gameboard[row][column].setFire(true);
		
		for(BattleShip b : battleShipArray) if(!b.isSunk()) return false;
	    return true;
	}
	
	
	public void gameOver(Player player) {		
		
						
		
	}
	

	//getter and setter
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
