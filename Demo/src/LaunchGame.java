import java.util.*;

public class LaunchGame1 {
	static class TicTacToe {
		static ArrayList<Integer> ppos =new ArrayList<Integer>();
		static ArrayList<Integer> cpos =new ArrayList<Integer>();
		
		private static void displayBoard(char[][] board) {
			for(char row[]:board) {
	        	for(char x:row) {
	        		System.out.print(x);
	        	}
	        	System.out.println();
	        }
		}
		static void insertPosition(char board[][], int pos, String ptype) {
			char c = 'X';
			if(ptype.equals("player")||ptype.equals("player1")) {
				c = 'X';
				ppos.add(pos);
			}else if(ptype.equals("cpu")||ptype.equals("player2")) {
				c = 'O';
				cpos.add(pos);
			}
			switch(pos) {
	        	case 1: 
	        		board[0][0] = c;
	        		break;
	        	case 2:
	        		board[0][2] = c;
	        		break;
	        	case 3: 
	        		board[0][4] = c;
	        		break;
	        	case 4: 
	        		board[2][0] = c;
	        		break;
	        	case 5: 
	        		board[2][2] = c;
	        		break;
	        	case 6: 
	        		board[2][4] = c;
	        		break;
	        	case 7: 
	        		board[4][0] = c;
	        		break;
	        	case 8: 
	        		board[4][2] = c;
	        		break;
	        	case 9: 
	        		board[4][4] = c;
	        		break;
	        	default:
	        		System.out.println("Invalid position");
	        		break;
	        }
		}
		
		public static void winningCondition(String ptype) {
			List<Integer> toprow = Arrays.asList(1,2,3);
			List<Integer> midrow = Arrays.asList(4,5,6);
			List<Integer> botrow = Arrays.asList(7,8,9);
			List<Integer> fircol = Arrays.asList(1,4,7);
			List<Integer> seccol = Arrays.asList(2,5,8);
			List<Integer> lastcol = Arrays.asList(3,6,9);
			List<Integer> diag1 = Arrays.asList(1,5,9);
			List<Integer> diag2 = Arrays.asList(3,5,7);
			
			ArrayList<List<Integer>> winningcond= new ArrayList<List<Integer>>();
			winningcond.add(toprow);
			winningcond.add(midrow);
			winningcond.add(botrow);
			winningcond.add(fircol);
			winningcond.add(seccol);
			winningcond.add(lastcol);
			winningcond.add(diag1);
			winningcond.add(diag2);
			
			int i = 0;
			String t = "";
			if(ptype.equals("player1")) {
				t = "Player 1";
			}else if(ptype.equals("player2")) {
				t = "Player 2";
			}else if(ptype.equals("cpu")) {
				t = "CPU";
			}else if(ptype.equals("player")) {
				t = "Player";
			}
			for(List<Integer> x: winningcond) {
				i++;
				if(ppos.containsAll(x)) {
					System.out.println(t + " has won the game!");
					System.exit(0);
				}else if(cpos.containsAll(x)) {
					System.out.println(t + " has won the game!");
					System.exit(0);
				}else if((ppos.size()+cpos.size())==9) {
					if(ppos.containsAll(x)) {
						System.out.println(t + " has won the game!");
						System.exit(0);
					} else {
						if (i == winningcond.size()) {
							System.out.println("It's a draw!");
							System.exit(0);
						}
					}

				}
			}
		}
		public static void singles(char board[][]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a position (1-9): ");
	        int pos = scan.nextInt();
	        
	        while(TicTacToe.ppos.contains(pos)||TicTacToe.cpos.contains(pos)) {
	        	System.out.println("Position already occupied. Please enter a new position(1-9): ");
	        	pos = scan.nextInt();
	        }
	        TicTacToe.insertPosition(board, pos, "player");
	        TicTacToe.displayBoard(board);
	        TicTacToe.winningCondition("player");
	        
	        Random rand = new Random();
	        int cpuPos = rand.nextInt(9)+1;
	        while(TicTacToe.ppos.contains(cpuPos)||TicTacToe.cpos.contains(cpuPos)) {
	        	System.out.println("Position already occupied. Please enter a new position(1-9): ");
	        	cpuPos = rand.nextInt(9)+1;
	        }
	        System.out.print("CPU: " + cpuPos + "\n");
	        TicTacToe.insertPosition(board, cpuPos, "cpu");
	        TicTacToe.displayBoard(board);
	        TicTacToe.winningCondition("cpu");
		}
		public static void doubles(char board[][]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a position (1-9) for Player 1: ");
	        int p1 = scan.nextInt();
	        while(TicTacToe.ppos.contains(p1)||TicTacToe.cpos.contains(p1)) {
	        	System.out.println("Position already occupied. Please enter a new position(1-9): ");
	        	p1 = scan.nextInt();
	        }
	        TicTacToe.insertPosition(board, p1, "player1");
	        TicTacToe.displayBoard(board);
	        TicTacToe.winningCondition("player1");
	        
	        System.out.println("Please enter a position (1-9) for Player 2: ");
	        int p2 = scan.nextInt();
	        while(TicTacToe.ppos.contains(p2)||TicTacToe.cpos.contains(p2)) {
	        	System.out.println("Position already occupied. Please enter a new position(1-9): ");
	        	p2 = scan.nextInt();
	        }
	        TicTacToe.insertPosition(board, p2, "player2");
	        TicTacToe.displayBoard(board);
	        TicTacToe.winningCondition("player2");
		}
	}
	
	public static void main(String[] args) {
        //create 2D array for tic tac toe board
        char board[][] = {{' ','|',' ','|',' '}, 
        					{'-','+','-','+','-'}, 
        					{' ','|',' ','|',' '}, 
        					{'-','+','-','+','-'}, 
        					{' ','|',' ','|',' '}};
        System.out.println("Welcome to TicTacToe Game!");
        TicTacToe.displayBoard(board);
        Scanner scan = new Scanner(System.in);
    	System.out.println("Please select either 1-Player or 2-Players [1/2]: ");
    	int go = scan.nextInt();
        while(true) {
        	switch(go) {
	        	case 1: 
	        		TicTacToe.singles(board);
	        		break;
	        	case 2: 
	        		TicTacToe.doubles(board);
	        		break;
	        	default:
	        		System.out.println("Invalid option");
	        		break;
        	}
        }
	}
}