import java.util.*;

public class LaunchGame {
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
			if(ptype.equals("player")) {
				c = 'X';
				ppos.add(pos);
			}else if(ptype.equals("cpu")) {
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
		
		public static void winningCondition() {
			List toprow = Arrays.asList(1,2,3);
			List midrow = Arrays.asList(4,5,6);
			List botrow = Arrays.asList(7,8,9);
			List fircol = Arrays.asList(1,4,7);
			List seccol = Arrays.asList(2,5,8);
			List lastcol = Arrays.asList(3,6,9);
			List diag1 = Arrays.asList(1,5,9);
			List diag2 = Arrays.asList(3,5,7);
			
			ArrayList<List> winningcond= new ArrayList<List>();
			winningcond.add(toprow);
			winningcond.add(midrow);
			winningcond.add(botrow);
			winningcond.add(fircol);
			winningcond.add(seccol);
			winningcond.add(lastcol);
			winningcond.add(diag1);
			winningcond.add(diag2);
			
			for(List x: winningcond) {
				if(ppos.containsAll(x)) {
					System.out.println("Player has won the game!");
					System.exit(0);
				}else if(cpos.containsAll(x)) {
					System.out.println("CPU has won the game!");
					System.exit(0);
				}else if((ppos.size()+cpos.size())==9) {
					System.out.println("It's a draw!");
					System.exit(0);
				}
			}
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
        
        while(true) {
	        System.out.println("Please enter a position (1-9): ");
	        Scanner scan = new Scanner(System.in);
	        int pos = scan.nextInt();
	        
	        while(TicTacToe.ppos.contains(pos)||TicTacToe.cpos.contains(pos)) {
	        	System.out.println("Position already occupied. Please enter a new position(1-9): ");
	        	pos = scan.nextInt();
	        }
	        TicTacToe.insertPosition(board, pos, "player");
	        TicTacToe.displayBoard(board);
	        TicTacToe.winningCondition();
	        
	        Random rand = new Random();
	        int cpuPos = rand.nextInt(9)+1;
	        while(TicTacToe.ppos.contains(cpuPos)||TicTacToe.cpos.contains(cpuPos)) {
	        	System.out.println("Position already occupied. Please enter a new position(1-9): ");
	        	cpuPos = rand.nextInt(9)+1;
	        }
	        System.out.print("CPU: " + cpuPos + "\n");
	        TicTacToe.insertPosition(board, cpuPos, "cpu");
	        TicTacToe.displayBoard(board);
	        TicTacToe.winningCondition();
        }
	}
	
}
