package Battleship;

import java.util.Scanner;

public class Player {

	public String name;
	public Ship[] ships = {
			new Carrier(),
			new Battleship(),
			new Cruiser(),
			new Submarine(),
			new Destroyer()
	};
	public Board board = new Board();
	public Board boardToAttack = new Board();
	public boolean isTurn;
	public int count = ships.length;
	
	public Player() {
		
	}
	
	public Scanner scan = new Scanner(System.in);
	
	public void setShips() throws Exception {
		
		System.out.println(name + ", it is your turn to set your ships!");
		System.out.println();
		setCarrier();
		setBattleship();
		setCruiser();
		setSubmarine();
		setDestroyer();
		System.out.println("Thank you!");
		System.out.println();
	}
	
	public void displayBoards(Board b1, Board b2) {
		System.out.print("*********YOUR BOARD**********");
		System.out.print("          ");
		System.out.print("*******BOARD YOU ATTACK*******\t\t\t" + "Ships left: " + count);
		System.out.println();
		System.out.println();
		for(int i = 0;i < 10; i++) {
			System.out.print(i+1 + "  ");
		}
		System.out.print("         ");
		for(int i = 0;i < 10; i++) {
			System.out.print(i+1 + "  ");
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.print(b1.getCellStatus(i, j) + "  ");
			}
			System.out.print(i+1);
			if(i == 9) {
				System.out.print("        ");
			}else
				System.out.print("         ");
			
			for (int j = 0; j < 10; j++) {
				System.out.print(b2.getCellStatus(i, j) + "  ");
			}
			System.out.print(i+1);
			System.out.println();
		}
	}
	
	
	public void setCarrier() throws Exception {
		
		int x;
		int y;
		char orientation;
		boolean flag = true;
		
		System.out.print(name + ", set X corrdinate for your " + ships[0].getName() +"(size " +ships[0].getSize() + ")" +  ": ");
		x = scan.nextInt();
		System.out.print(name + ", set Y corrdinate for your " + ships[0].getName() + "(size " +ships[0].getSize() + ")" +  ": ");
		y = scan.nextInt();
		System.out.print(name + ", set orientation for your " + ships[0].getName() + ": (h/v) ");
		orientation = scan.next(".").charAt(0);
		
		if(orientation == 'h') {
			if(y <= 6) {
				for(int i = 0; i < ships[0].size; i++) {
					if(board.getCellStatus(x-1, (y - 1) + i) != 'o'){
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[0].size; i++)
						board.carrierOn(x - 1, (y - 1) + i);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setCarrier();
				}
			}else {
				System.out.println("Invalid, try again");
				setCarrier();
			}
		}else if(orientation == 'v') {
			if(x <= 6) {
				for(int i = 0; i < ships[0].size; i++) {
					if(board.getCellStatus((x - 1) + i, y - 1) != 'o') {
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[0].size; i++)
						board.carrierOn((x - 1) + i, y - 1);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setCarrier();
				}
			}else {
				System.out.println("Invalid, try again!");
				setCarrier();
			}		
		}else {
			System.out.println("Invalid sign, try again!");
			setCarrier();
		}
		board.displayBoard();
	}
	
	public void setBattleship() throws Exception {
		
		boolean flag = true;
		
		System.out.print(name + ", set X corrdinate for your " + ships[1].getName() + "(size " + ships[1].getSize() + ")" +  ": ");
		int x = scan.nextInt();
		System.out.print(name + ", set Y corrdinate for your " + ships[1].getName() + "(size " + ships[1].getSize() + ")" +  ": ");
		int y = scan.nextInt();
		System.out.print(name + ", set orientation for your " + ships[1].getName() + ": (h/v) ");
		char orientation = scan.next(".").charAt(0);
		
		if(orientation == 'h') {
			if(y <= 7) {
				for(int i = 0; i < ships[1].size; i++) {
					if(board.getCellStatus(x-1, (y - 1) + i) != 'o'){
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[1].size; i++)
						board.battleshipOn(x - 1, (y - 1) + i);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setBattleship();
				}
			}else {
				System.out.println("Invalid, try again");
				setBattleship();
			}
		}else if(orientation == 'v') {
			if(x <= 7) {
				for(int i = 0; i < ships[1].size; i++) {
					if(board.getCellStatus((x - 1) + i, y - 1) != 'o') {
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[1].size; i++)
						board.battleshipOn((x - 1) + i, y - 1);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setBattleship();
				}
			}else {
				System.out.println("Invalid, try again!");
				setBattleship();
			}		
		}else {
			System.out.println("Invalid sign, try again!");
			setBattleship();
		}
		board.displayBoard();
	}
	
	public void setCruiser() throws Exception {
		
		boolean flag = true;
		
		System.out.print(name + ", set X corrdinate for your " + ships[2].getName() + "(size " + ships[2].getSize() + ")" + ": ");
		int x = scan.nextInt();
		System.out.print(name + ", set Y corrdinate for your " + ships[2].getName() + "(size " + ships[2].getSize() + ")" + ": ");
		int y = scan.nextInt();
		System.out.print(name + ", set orientation for your " + ships[2].getName() + ": (h/v) ");
		char orientation = scan.next(".").charAt(0);
		
		if(orientation == 'h') {
			if(y <= 8) {
				for(int i = 0; i < ships[2].size; i++) {
					if(board.getCellStatus(x-1, (y - 1) + i) != 'o'){
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[2].size; i++)
						board.cruiserOn(x - 1, (y - 1) + i);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setCruiser();
				}
			}else {
				System.out.println("Invalid, try again");
				setCruiser();
			}
		}else if(orientation == 'v') {
			if(x <= 8) {
				for(int i = 0; i < ships[2].size; i++) {
					if(board.getCellStatus((x - 1) + i, y - 1) != 'o') {
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[2].size; i++)
						board.cruiserOn((x - 1) + i, y - 1);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setCruiser();
				}
			}else {
				System.out.println("Invalid, try again!");
				setCruiser();
			}		
		}else {
			System.out.println("Invalid sign, try again!");
			setCruiser();
		}
		board.displayBoard();
	}
	
	public void setSubmarine() throws Exception {
		int x;
		int y;
		char orientation;
		boolean flag = true;
		
		System.out.print(name + ", set X corrdinate for your " + ships[3].getName() + "(size " +ships[3].getSize() + ")" + ": ");
		x = scan.nextInt();
		System.out.print(name + ", set Y corrdinate for your " + ships[3].getName() + "(size " +ships[3].getSize() + ")" + ": ");
		y = scan.nextInt();
		System.out.print(name + ", set orientation for your " + ships[3].getName() + ": (h/v) ");
		orientation = scan.next(".").charAt(0);
		
		if(orientation == 'h') {
			if(y <= 8) {
				for(int i = 0; i < ships[3].size; i++) {
					if(board.getCellStatus(x-1, (y - 1) + i) != 'o'){
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[3].size; i++)
						board.submarineOn(x - 1, (y - 1) + i);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setSubmarine();
				}
			}else {
				System.out.println("Invalid, try again");
				setSubmarine();
			}
		}else if(orientation == 'v') {
			if(x <= 8) {
				for(int i = 0; i < ships[3].size; i++) {
					if(board.getCellStatus((x - 1) + i, y - 1) != 'o') {
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[3].size; i++)
						board.submarineOn((x - 1) + i, y - 1);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setSubmarine();
				}
			}else {
				System.out.println("Invalid, try again!");
				setSubmarine();
			}		
		}else {
			System.out.println("Invalid sign, try again!");
			setSubmarine();
		}
		board.displayBoard();
	}
	
	public void setDestroyer() throws Exception {
		
		int x;
		int y;
		char orientation;
		boolean flag = true;
		
		System.out.print(name + ", set X corrdinate for your " + ships[4].getName() + "(size " +ships[4].getSize() + ")" + ": ");
		x = scan.nextInt();
		System.out.print(name + ", set Y corrdinate for your " + ships[4].getName() + "(size " +ships[4].getSize() + ")" + ": ");
		y = scan.nextInt();
		System.out.print(name + ", set orientation for your " + ships[4].getName() + ": (h/v) ");
		orientation = scan.next(".").charAt(0);
		
		if(orientation == 'h') {
			if(y <= 9) {
				for(int i = 0; i < ships[4].size; i++) {
					if(board.getCellStatus(x-1, (y - 1) + i) != 'o'){
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[4].size; i++)
						board.destroyerOn(x - 1, (y - 1) + i);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setDestroyer();
				}
			}else {
				System.out.println("Invalid, try again");
				setDestroyer();
			}
		}else if(orientation == 'v') {
			if(x <= 9) {
				for(int i = 0; i < ships[4].size; i++) {
					if(board.getCellStatus((x - 1) + i, y - 1) != 'o') {
						flag = false;
					}
				}
				if(flag) {
					for(int i = 0; i < ships[4].size; i++)
						board.destroyerOn((x - 1) + i, y - 1);
				}else {
					System.out.println("Another ship in position, set new corrdinates!");
					setDestroyer();
				}
			}else {
				System.out.println("Invalid, try again!");
				setDestroyer();
			}		
		}else {
			System.out.println("Invalid sign, try again!");
			setDestroyer();
		}
		board.displayBoard();
		
	}
	
	public void play(Player p) throws Exception {
		System.out.println();
		Scanner scan1 = new Scanner(System.in);
		System.out.println(name +", press ENTER to play!");
		scan1.nextLine();
		displayBoards(board, boardToAttack);
		System.out.println();
		System.out.print(name + ", choose first corrdinate to attack: ");
		int x = scan.nextInt();
		System.out.print(name + ", choose second corrdinate to attack: ");
		int y = scan.nextInt();
		if((x > 0 && x <= 10) && (y > 0 && y <= 10)) {
			attack(p, x, y);
		}else {
			System.out.println("Invalid coordinates, try again!");
			play(p);
		}
		
		isTurn = false;
		p.isTurn = true;
		
	}
	
	public void attack(Player p, int x, int y) throws Exception {
		char status = p.board.getCellStatus(x - 1, y - 1);
		switch(status) {
		case 'A':
			p.board.gotHit(x - 1, y - 1);
			boardToAttack.gotHit(x - 1, y - 1);
			System.out.println("Hit!");
			p.ships[0].gotHit();
			if(p.ships[0].isDestroyed()) {
				p.count--;
				System.out.println("*****" + p.name + "'s " + p.ships[0].getName() + " destroyed*****");
			}
			break;
		case 'B':
			p.board.gotHit(x - 1, y - 1);
			p.ships[1].gotHit();
			boardToAttack.gotHit(x - 1, y - 1);
			System.out.println("Hit!");
			if(p.ships[1].isDestroyed()) {
				p.count--;
				System.out.println("*****" + p.name + "'s " + p.ships[1].getName() + " destroyed*****");
			}
			break;
		case 'C':
			p.board.gotHit(x - 1, y - 1);
			p.ships[2].gotHit();
			boardToAttack.gotHit(x - 1, y - 1);
			System.out.println("Hit!");
			if(p.ships[2].isDestroyed()) {
				p.count--;
				System.out.println("*****" + p.name + "'s " + p.ships[2].getName() + " destroyed*****");
			}
			break;
		case 'D':
			p.board.gotHit(x - 1, y - 1);
			p.ships[3].gotHit();
			boardToAttack.gotHit(x - 1, y - 1);
			System.out.println("Hit!");
			if(p.ships[3].isDestroyed()) {
				p.count--;
				System.out.println("*****" + p.name + "'s " + p.ships[3].getName() + " destroyed*****");
			}
			break;
		case 'E':
			p.board.gotHit(x - 1, y - 1);
			p.ships[4].gotHit();
			boardToAttack.gotHit(x - 1, y - 1);
			System.out.println("Hit!");
			if(p.ships[4].isDestroyed()) {
				p.count--;
				System.out.println("*****" + p.name + "'s " + p.ships[4].getName() + " destroyed*****");
			}
			break;
		case 'x':
			System.out.println("Already attacked selected position!");
			break;
		case '~':
			System.out.println("Already attacked selected position!");
			break;
		default:
			p.board.gotMiss(x - 1, y - 1);
			boardToAttack.gotMiss(x - 1, y - 1);
			System.out.println("Miss!");
			break;
		}
	}
	
}
