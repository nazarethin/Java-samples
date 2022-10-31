package geometry;

public class Position{

	private int x;
	private int y;	


	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String getRepresentation(){
		return "position 'x' is "+ this.getX() + " and position 'y' is " + this.getY();
	}
	
	public Position symmetricX(){
		return new Position(-this.getX(), -this.getY());
	}
	
	public	Position translate(int dx, int dy){
		this.x = this.x+dx;
		this.y = this.y+dy;
		return new Position(this.getX(), this.getY());
	}
}
