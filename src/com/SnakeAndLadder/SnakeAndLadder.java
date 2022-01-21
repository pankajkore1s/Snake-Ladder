package com.SnakeAndLadder;

import java.util.*;

public class SnakeAndLadder {

	public static final int finalPosition=100;

	public static void main (String []args) {

		int Player1Position=0;
		int Payer2Position=0;
		int initialPosition = 0;
		int Dice=(int)(Math.random()*6+1);
		System.out.println("number got on dice="+Dice);

		int optionCheck=(int)(Math.random()*3+1);
		//1:LADDER 2:SNAKE 3:NOPLAY
		System.out.println("got option="+optionCheck);

		switch(optionCheck) {

		case 1:                     //.LADDER
			Player1Position=initialPosition+Dice;
			System.out.println("Position of Player 1="+Player1Position);
			break;

		case 2:
			Player1Position-=Dice;
			System.out.println("Position of Player 1="+Player1Position);
			break;

		case 3:
			System.out.println("position of player 1="+Player1Position);
			break;

		}

	}


}




//////////////int dice1=(int)(Math.random()*6+1);