package geometry;


class afficheSegment{
	public static void main(String[] args) {
		Position p = new Position(3,4);
		Position p2 = new Position(7,7);
		Segment seg = new Segment(p, p2);
		System.out.println(seg.getRepresentation());
		System.out.println(seg);
	}
  }
