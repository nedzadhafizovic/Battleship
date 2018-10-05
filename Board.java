package Battleship;

public class Board {
	
	public char[][] board;
	
	public Board() {
		board = new char[10][10];
	}
	
	public void gotHit(int x, int y) {
		board[x][y] = 'x';
	}
	
	public void gotMiss(int x, int y) {
		board[x][y] = '~';
	}
	
	public void battleshipOn(int x, int y) {
		board[x][y] = 'B';
	}
	public void cruiserOn(int x, int y) {
		board[x][y] = 'C';
	}
	public void submarineOn(int x, int y) {
		board[x][y] = 'D';
	}
	public void destroyerOn(int x, int y) {
		board[x][y] = 'E';
	}
	public void carrierOn(int x, int y) {
		board[x][y] = 'A';
	}
	
	public void initBoard() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				board[i][j] = 'o';
			}
		}
	}
	
	public void displayBoard() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i+1 + "  ");
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println(i+1);
		}
		
		System.out.println();
	}
	
	public char getCellStatus(int x, int y) {
		return board[x][y];
	}
	
}
