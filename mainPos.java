package geometry;


class mainPos{
	public static void main(String[] args) {
		Position p = new Position(3,4);
		System.out.println(p.getRepresentation());
		Position s = p.symmetricX();
		System.out.println(s.getRepresentation());
		p.translate(7, 8);
		System.out.println(p.getRepresentation());
	}
  }
