package Battleship;

import java.util.Scanner;


public class Menu {

	Game game = new Game();
	
	public void welcome() throws Exception {
		System.out.println("**********************B-A-T-T-L-E-S-H-I-P***********************");
		System.out.print("|");
		System.out.println(" Welcome to Battleship, very fun game for two players. Please |");
		System.out.print("|");
		System.out.println("\tchoose one of the options from the menu below!         |");
		System.out.println("|\t\t\t\t\t\t\t       |");
		System.out.println("****************************************************************");
		System.out.println();
		System.out.println();
		System.out.println("Start a new game - 1");
		System.out.println("How to play? - 2");
		System.out.println("Credits - 3");
		System.out.println();
		int choice;
		System.out.print("Enter a number next to the option you want to choose: ");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		if(choice == 1) {
			game.initNewGame();
		}else if(choice == 2) {
			showHowTo();
		}else if(choice == 3) {
			showCredits();
		}else {
			System.out.println("Invalid option, choose another!");
			welcome();
		}
		System.out.println();
		System.out.println();
		scan.close();
	}
	public void showHowTo() throws Exception {
		System.out.println();
		System.out.println();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("************************* HOW TO? *************************");
		System.out.println("***********************************************************");
		System.out.println("Battleship is played in conosle, meaning that players enter");
		System.out.println("their commands into it. Each player first must set his fleet.");
		System.out.println("Setting fleet is done through X and Y coordinates. After that,");
		System.out.println("the real battle starts. Players are asked to enter coordinates");
		System.out.println("for an attack repeatedly until one player entirely destorys");
		System.out.println("another player's fleet. Once the game is over, winner is announced.");
		System.out.println();
		System.out.print("Press ENTER to go back to main menu:");
		scan1.nextLine();
		welcome();
		scan1.close();
	}
	
	public void showCredits() throws Exception {
		System.out.println();
		System.out.println();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("***********************************************************");
		System.out.println("************************* CREDITS *************************");
		System.out.println("***********************************************************");
		System.out.println("Developed by: Nedzad Hafizovic");
		System.out.println("E-mail: nedzad.hafzovic10@gmail.com");
		System.out.println("Developed as a result of a job interview at Softwerk!");
		System.out.println();
		System.out.print("Press ENTER to go back to main menu:");
		scan1.nextLine();
		welcome();
		scan1.close();
	}
}
	
	
