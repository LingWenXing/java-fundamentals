import java.util.Scanner;

class Guesser{
	int gnum;
	int guessNum() {
		System.out.println("Guesser, kindly guess a number:(0-50)");
		Scanner scan = new Scanner(System.in);
//		gnum = scan.nextInt();
		gnum = (int) (Math.random() * 20);//cast to int;
		System.out.println(gnum);
		return gnum;
	}
}

class Player{
	int pnum;
	int guessNum() {
		System.out.println("Player, kindly guess a number:(0-50)");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
	}
}

class Umpire{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numfromguesser=g.guessNum();
	}
	void collectNumFromPlayer() {
		Player p1 = new Player();
		numfromplayer1=p1.guessNum();
		
		Player p2 = new Player();
		numfromplayer2=p2.guessNum();
		
		Player p3 = new Player();
		numfromplayer3=p3.guessNum();
	}
	void compare() {
		if(numfromguesser==numfromplayer1) {
			System.out.println("Player1 wins");
		}else if(numfromguesser==numfromplayer2) {
			System.out.println("Player2 wins");
		}else if(numfromguesser==numfromplayer3) {
			System.out.println("Player3 wins");
		}else {
			System.out.println("Game lost. Try again!!!");
		}
	}
}

public class LaunchGuesser {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}
