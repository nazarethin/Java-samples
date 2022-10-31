package games.tictactoe;
import java.util.Scanner;

public class interfaceTicTacToe{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("1st player please enter your name");
		String j1 = scanner.next();
		System.out.println("Your name is " + j1);

		System.out.println("2nd player please enter your name");
		String j2 = scanner.next();
		System.out.println("Your name is " + j2);

		TicTacToe tictactoe  = new TicTacToe(j1, j2);

		while(!tictactoe.isOver()){
			tictactoe.situationToString();
			System.out.println(tictactoe.getCurrentPlayer() + " Enter your move ");
			System.out.println("Validated moves: ");
			for(int i=0; i<tictactoe.validMoves().size(); i++){
				int coupValide = tictactoe.validMoves().get(i);
				System.out.println(coupValide + " = (" + (tictactoe.line(coupValide)+1) + " , " + (tictactoe.column1(coupValide)+1) + " ) ");
			}
			System.out.println("Your move? ");
			int cell = scanner.nextInt();
			if(tictactoe.validMoves().contains(cell)){
				tictactoe.execute(cell);
			}else{
				System.out.println("The move is not valid");
			}
		}

		tictactoe.situationToString();
		if(tictactoe.validMoves().size() == 0 && tictactoe.getWinner() == null){
			System.out.println("This game is a draw..");
		}else{
			System.out.println("Congrats! " + tictactoe.getCurrentPlayer() + " you won!");
		}
	}
}
