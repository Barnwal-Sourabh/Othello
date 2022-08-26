import java.util.Scanner;

public class Player{
	static Scanner s = new Scanner(System.in);

	final static int player1Symbol = 1;
	final static int player2Symbol = 2;
	
	public static void main(String[] args) {
		OthelloBoard b = new OthelloBoard();
		int n = s.nextInt();
		boolean p1Trun = true;

		while(n>0){
			int x = s.nextInt();
			int y = s.nextInt();
			boolean ans = false;
			if(p1Trun){
				ans = b.move(player1Symbol, x, y);
			}else{
				ans = b.move(player2Symbol, x, y);
			}
			if(ans){
				b.print();
				p1Trun = !p1Trun;
				n--;
			}else {
				System.out.println(ans);
			}
		}
	}
}