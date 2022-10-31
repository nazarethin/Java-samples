package geometry;


public class Segment{
	private Position a;
	private Position b;
	
	public Segment(Position a, Position b){
		this.a = a;
		this.b = b;
	
	}	
	
	public String getRepresentation(){
	
		return "segment of 'a' is "+ this.a.getRepresentation() + " and segment of 'b' is " + 			this.b.getRepresentation();
		
	}
	
	public double length(){
		int length = a.getX() - b.getX();
		int height = 	a.getY() - b.getY();
		return Math.sqrt(length*height);
	}

}
