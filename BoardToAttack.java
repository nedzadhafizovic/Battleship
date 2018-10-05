//package Battleship;
//
//public class BoardToAttack {
//	
//	
//	public char[][] board;
//	
//	public BoardToAttack() {
//		board = new char[10][10];
//	}
//	
//	public void initBoard() {
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				board[i][j] = 'o';
//			}
//		}
//	}
//	
//	public void hit(int x, int y) {
//		board[x][y] = 'x';
//	}
//	
//	public void miss(int x, int y) {
//		board[x][y] = '~';
//	}
//	public void displayBoard() {
//		for(int i = 0; i < 10; i++) {
//			System.out.print(i+1 + "  ");
//		}
//		System.out.println();
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				System.out.print(board[i][j] + "  ");
//			}
//			System.out.println(i+1);
//		}
//		
//		System.out.println();
//	}
//	
//
//	
//}
