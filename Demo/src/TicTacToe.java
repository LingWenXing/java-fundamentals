import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	public static final int ACTIVE = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int CIRCLE_WON = 3;
	 
	public static int currStatus = ACTIVE;  // the current status of the game
	
	private static void printBoard(char[][] board) {
		for(char row[]:board) {
        	for(char x:row) {
        		System.out.print(x);
        	}
        	System.out.println();
        }
	}
	
	private static boolean isFill(char board[][], int row, int col){
		boolean filled = false;
		if(board[row][col] == 'X' || board[row][col] == 'O') {
			filled = true;
		}
		return filled;
	}
	
	public static boolean gameWon(char board[][], char c) {
		boolean gameWon=false;
		// 3-in-the-row
		if(board[0][0] == c && board[0][2] == c  && board[0][4] == c) {
			gameWon=true;
		}else if(board[2][0] == c && board[2][2] == c && board[2][4] == c) {
			gameWon=true;
		}else if(board[4][0] == c && board[4][2] == c && board[4][4] == c) {
			gameWon=true;
		}else if(board[0][0] == c && board[2][2] == c && board[4][4] == c) { // 3-in-the-diagonal
			gameWon=true;
		}else if(board[0][4] == c  && board[2][2] == c && board[4][0] == c) { // 3-in-the-opposite-diagonal
			gameWon=true;
		}else if(board[0][0] == c  && board[2][0] == c  && board[4][0] == c) { // 3-in-the-vertical
			gameWon=true;
		}else if(board[0][2] == c && board[2][2] == c && board[4][2] == c) {
			gameWon=true;
		}else if(board[0][4] == c && board[2][4] == c && board[4][4] == c) {
			gameWon=true;
		}
		return gameWon;
	}
	
	public static boolean boardFull(char [][] board) {
	    if (board[0][0] != ' ' && board[0][2] != ' ' && board[0][4] != ' ' &&
	        board[2][0] != ' ' && board[2][2] != ' ' && board[2][4] != ' ' &&
	        board[4][0] != ' ' && board[4][2] != ' ' && board[4][4] != ' ') {
	        return true;
	    }else {
	        return false;
	    }

	}
	
	private static boolean insertPosition(char board[][], int pos, String pType) {
		char c = 'X';
		if(pType.equals("CPU")) {
			c = 'O';
		}else {
			c = 'X';
		}
		boolean successFlag = true;
		switch(pos) {
        	case 1:
        		if(TicTacToe.isFill(board, 0, 0)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[0][0] = c;
        		}
        		break;
        	case 2:
        		if(TicTacToe.isFill(board, 0, 2)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[0][2] = c;
        		}
        		break;
        	case 3: 
        		if(TicTacToe.isFill(board, 0, 4)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[0][4] = c;
        		}
        		break;
        	case 4: 
        		if(TicTacToe.isFill(board, 2, 0)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[2][0] = c;
        		}
        		break;
        	case 5:
        		if(TicTacToe.isFill(board, 2, 2)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[2][2] = c;
        		}
        		break;
        	case 6: 
        		if(TicTacToe.isFill(board, 2, 4)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[2][4] = c;
        		}
        		break;
        	case 7: 
        		if(TicTacToe.isFill(board, 4, 0)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[4][0] = c;
        		}
        		break;
        	case 8: 
        		if(TicTacToe.isFill(board, 4, 2)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[4][2] = c;
        		}
        		break;
        	case 9: 
        		if(TicTacToe.isFill(board, 4, 4)) {
        			successFlag = false;
        			if(c=='0') {
        				Random rand = new Random();
    			        pos = rand.nextInt(9)+1;
        			}
        		}else {
        			board[4][4] = c;
        		}
        		break;
        	default:
        		System.out.println("Invalid position");
        		break;
        }
		if(!successFlag) {
			System.out.println("Position " + pos + " is filled!");
		}
		return successFlag;
	}
	
	public static int updateStatus(char board[][], char c) {
		if(TicTacToe.gameWon(board, c)) {
			currStatus = (c == 'X') ? CROSS_WON : CIRCLE_WON;
		}else if(TicTacToe.boardFull(board)) {
			currStatus = DRAW;
		}
		return currStatus;
	}
	public static char checkPlayerType(String pType) {
		char c = ' ';
        if(pType.equals("CPU")) {
			c = 'O';
		}else if(pType.equals("Player")) {
			c = 'X';
		}
		return c;
	}
	
	public static void main(String[] args) {
        //create 2D array for tic tac toe board
        char board[][] = {{' ','|',' ','|',' '}, 
        					{'-','+','-','+','-'}, 
        					{' ','|',' ','|',' '}, 
        					{'-','+','-','+','-'}, 
        					{' ','|',' ','|',' '}};
        
        
        System.out.println("Welcome to TicTacToe Game!");
        TicTacToe.printBoard(board);
        do {
	        boolean flag=false;
	        System.out.print("Please enter a position (1-9): ");
	        Scanner scan = new Scanner(System.in);
	        int pos = scan.nextInt();
	        flag=insertPosition(board, pos, "Player");
	        TicTacToe.printBoard(board);
	        System.out.println();
	        currStatus=TicTacToe.updateStatus(board, TicTacToe.checkPlayerType("Player"));
	        if(flag && currStatus == ACTIVE) {
	        	Random rand = new Random();
	        	int cpuPos = 1;
	        	do {
	        		cpuPos = rand.nextInt(9)+1;
	        		System.out.print("CPU: " + cpuPos + "\n");
	        		flag=insertPosition(board, cpuPos, "CPU");
	        		currStatus=TicTacToe.updateStatus(board, TicTacToe.checkPlayerType("CPU"));
	        	}while(!flag && (currStatus !=DRAW || currStatus !=CROSS_WON || currStatus !=CIRCLE_WON));
		        TicTacToe.printBoard(board);
		    }
        }while(currStatus == ACTIVE);
        
        // print status message
        if (currStatus == CROSS_WON) {
        	System.out.println("'X' Won!");
        } else if (currStatus == DRAW) {
        	System.out.println("It's a Draw!");
        } else if (currStatus == CIRCLE_WON) {
        	System.out.println("'O' Won!");
        }
	}
	
}
