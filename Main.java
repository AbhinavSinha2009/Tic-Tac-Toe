import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		game();
	} // End of main method
		public static void game() {
			 char turn = 'X';
			 int times = 1;
			 int input = 0;
			//All input positions
			 char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
			
			//Sample Graph
			System.out.println("\n\tPositional Graph");
			System.out.println("\t______________\n");
			System.out.println("\t " + 7 + " | " + 8 + " | " + 9 + " ");
			System.out.println("\t --+---+---"); 
			System.out.println("\t " + 4 + " | " + 5 + " | " + 6 + " ");
			System.out.println("\t --+---+---");
			System.out.println("\t " + 1 + " | " + 2 + " | " + 3 + " \n");
			try {
			while(true) {
			do {
			System.out.print("\nPlease enter a valid position: ");
			input = sc.nextInt();
			} while (pos[input - 1] == 'X' || pos[input - 1] == 'O'); // Enter a valid position; not one already taken
			// Holds all positions of input
			pos[input - 1] = turn;
			
			// Game Layout
			System.out.println("\n \t  " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
			System.out.println("\t ---+---+---"); 
			System.out.println("\t  " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
			System.out.println("\t ---+---+---");
			System.out.println("\t  " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
			if(pos[0] == turn && pos[1] == turn && pos[2] == turn 
			|| pos[3] == turn && pos[4] == turn && pos[5] == turn
			|| pos[6] == turn && pos[7] == turn && pos[8] == turn
			//check all rows
			|| pos[6] == turn && pos[3] == turn && pos[0] == turn 
			|| pos[7] == turn && pos[4] == turn && pos[1] == turn
			|| pos[8] == turn && pos[5] == turn && pos[2] == turn
			// check all columns
			|| pos[6] == turn && pos[4] == turn && pos[2] == turn 
			|| pos[8] == turn && pos[4] == turn && pos[0] == turn
			//check all diagonals
					) {
				System.out.println("Good Job, player " + turn + " has won the game in " + times + " turns!\n");
				System.out.println("Player " + turn + ", there is always next time!");
				break;
			} 
				// switch turns
				if(turn == 'X') {
					turn = 'O';
				} else if(turn == 'O') {
					turn = 'X';
				} 
				times++;
				if(times > 9) {
					System.out.println("DRAW, the whole board is filled");
				}
			}
			} catch(Exception e){
				System.out.println("Please enter a valid input; single digits number between 1-9");
				game();
			}// End of while loop
		} //end of game method
} // End of class
/*
How the board looks like
 7 | 8 | 9  
---+---+---
 4 | 5 | 6
---+---+---
 1 | 2 | 3
*/
