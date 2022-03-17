import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	private static void playingBoard(char[][] board) {
		for(char row[]:board) {
        	for(char x:row) {
        		System.out.print(x);
        	}
        	System.out.println();
        }
	}
	private static void insertPosition(char board[][], int pos, boolean cpu) {
//		Can pass boolean as parameter
		char c = 'X';
		if(cpu) {
			c = 'O';
		}else {
			c = 'X';
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
	public static void main(String[] args) {
        //create 2D array for tic tac toe board
        char board[][] = {{' ','|',' ','|',' '}, 
        					{'-','+','-','+','-'}, 
        					{' ','|',' ','|',' '}, 
        					{'-','+','-','+','-'}, 
        					{' ','|',' ','|',' '}};
        playingBoard(board);
        
        while(true) {
	        System.out.println("Please enter a position (1-9): ");
	        Scanner input = new Scanner(System.in);
	        int pos = input.nextInt();
	        insertPosition(board, pos, false);
	        playingBoard(board);
	        
	        Random rand = new Random();
	        int cpuPos = rand.nextInt(9)+1;
	        insertPosition(board, cpuPos, true);
	        playingBoard(board);
        }
	}
	
}
