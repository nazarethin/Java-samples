package games.tictactoe;
import java.util.ArrayList;


public class TicTacToe{

	private String j1; //j1 AND j2 IS A REPRESENTATION OF 2 PLAYERS
	private String j2;
	private String[][] tab = new String[][]{{"   ", "   ", "   "},{"   ", "   ", "   "},{"   ", "   ", "   "}}; //"tab" IS A REPRESENTATION OF GRID ON WHICH PLAYERS CAN INSERT THEIR SYMBOLS
	private String currentPlayer;


	public TicTacToe(String j1, String j2){
		this.j1 = j1;
		this.j2 = j2;
		this.tab = tab;
		this.currentPlayer = currentPlayer;
	}

		public String getCurrentPlayer(){
			return currentPlayer;
		}
		//FUNCTION "execute" IS MADE FOR SUPPLYING EACH PLAYER WITH A SYMBOL THAT GETS INSERTED ON THE GRID
		public void execute(int cell){
			if(this.currentPlayer == j1){
				this.tab[line(cell)][column1(cell)] = " X ";
				this.currentPlayer = j2;
			}else{
				this.tab[line(cell)][column1(cell)] = " O ";
				this.currentPlayer = j1;
			}

		}
		// CREATION OF THE LINES FOR THE GRID IS DONE BY THE FOLLOWING CALCULATION:
		// 0  1  2
		// 3  4  5
		// 6  7  8
		public int line(int cell){
			int res = 0;
			if(cell>=0 && cell<=3){
				res = 0;
			}
			if(cell>=3 && cell<=5){
				res = 1;
			}
			if(cell>=6 && cell<=8){
				res = 2;
			}
			return res;
		}
		// SAME CALCULATION IS DONE HERE FOR THE COLUMNS
		public int column1(int cell){
			int res = 0;
			if(cell == 0 || cell == 3 || cell == 6){
				res = 0;
			}
			if(cell == 1 || cell == 4 || cell == 7){
				res = 1;
			}
			if(cell == 2 || cell == 5 || cell == 8){
				res = 2;
			}
			return res;
		}
		// CHECKS IF THE MOVE ON THE GRID IS VALID BY TAKING THE GRID WITH ITS LINES AND COLUMNS IN ARGUMENTS
		public boolean isValid(int cell){

			int l = this.line(cell);
			int c = this.column1(cell);
			return this.tab[line(cell)][column1(cell)] == "   ";

		}
		// METHOD "validMoves" RETURNS A LIST OF ALL OF THE VALID MOVES IN THE CURRENT SITUATION
		public ArrayList<Integer> validMoves(){
			ArrayList<Integer> validMoves = new ArrayList<>();
			for(int i = 0; i<(this.tab.length)*(this.tab.length); i++){
				if(isValid(i)){
					validMoves.add(i);
				}
			}
		return validMoves;
		}

		//METHOD "wins", TAKES INTO AN ARGUMENT A PLAYER, A NUMBER OF A ROW, A NUMBER OF A COLUMN, A DIRECTION DELTAROW(+1, 0 OR −1)
		//AND A DELTACOLUMN DIRECTION, AND RETURNING A BOOLEAN INDICATING WHETHER THE ALIGNMENT OF THE BOXES OF COORDINATES
		//IS FULLY OCCUPIED BY THE GIVEN PLAYER.THIS METHOD IS AFTER USED
		//TO PERFORM THE "getWinner" METHOD, CALLING IT FOR EACH ROW, COLUMN, AND DIAGONAL OF THE GRID
		public boolean wins(String joueur, int row, int column, int deltaRow, int deltaColumn)
		{
			if(this.tab[row][column] == this.tab[row + deltaRow][column + deltaColumn] && this.tab[row][column] == this.tab[row + 2 * deltaRow][column + 2 * 	deltaColumn] && this.tab[row + deltaRow][column + deltaColumn] == this.tab[row + 2 * deltaRow][column + 2 * deltaColumn] && this.tab[row][column] != "   ")
			{
				return true;
			}else{
				return false;
			}
   		}


   		public String getWinner(){
   			String res = null;
   			if(wins(getCurrentPlayer(), 0, 0, 1, 1) || wins(getCurrentPlayer(), 0, this.tab.length-1, 1, -1)){
   				res = getCurrentPlayer();
   			}
   			for(int i=0; i<this.tab.length; i++){
   				if(wins(getCurrentPlayer(), i, 0, 0, 1)){
   					res = getCurrentPlayer();
   				}else if(wins(getCurrentPlayer(), 0, i, 1, 0)){
   					res = getCurrentPlayer();
   				}
   			}
   			return res;
   		}

   		public boolean isOver(){
   			return (getWinner() != null || validMoves().size() == 0);
   		}
			// THE METHOD BELOW REPRESENTS THE GRID IN THE FORM OF STRINGS FOR THE EASIER INTERFACE IMPLEMENTATION
   		public void situationToString(){
   			System.out.println("    1  2  3 ");
   			for(int i=0;i<tab.length;i++){
   				System.out.print(" " + Integer.toString(i+1) + " ");
   				for(int j=0;j<tab.length;j++){
   					System.out.print(this.tab[i][j]);
   			}
   			System.out.println("");
   		}

   	}







}
