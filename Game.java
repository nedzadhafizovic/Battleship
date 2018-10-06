package Battleship;

import java.util.Scanner;

public class Game {
	
	public Game() {
		
	}
	
	public Player getWinner(Player p1, Player p2) {
		if(p1.count == 0) {
			return p2;
		}else
			return p1;
	}
	
	public boolean isGameOver(Player p1, Player p2) {
		if(p1.count == 0 || p2.count == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void initNewGame() throws Exception {
		Player p1 = new Player();
		Player p2 = new Player();
		
		System.out.println();
		System.out.println("****************Time to play BATTLESHIP!****************");
		System.out.println();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Player 1, enter your name: ");
		p1.name = scan1.next();
		
		System.out.print("Player 2, enter your name: ");
		p2.name = scan1.next();
		
		p1.opponent = p2;
		p2.opponent = p1;
		
		p1.board.initBoard();
		p2.board.initBoard();
		
		p1.boardToAttack.initBoard();
		p2.boardToAttack.initBoard();
		
		p1.setShips();
		p2.setShips();
		
		p1.isTurn = true;
		p2.isTurn = false;
		
		while(isGameOver(p1, p2) == false) {
			if(p1.isTurn == true)
				p1.play(p2);
			else if(p2.isTurn == true) {
				p2.play(p1);
			}
		}
		
		System.out.println("GAME OVER!!!");
		System.out.println("Winner is: " + getWinner(p1, p2).name);
		System.out.println();
		
		scan1.close();
	}
}
