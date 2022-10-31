package geometry;

import geometrytests.PositionTests;
import geometrytests.SegmentTests;



public class testPosition{

	public static void main(String[] args) {
		PositionTests positionTester = new PositionTests();
		boolean ok = true;
		ok = ok && positionTester.testGetX();
		ok = ok && positionTester.testGetY();
		ok = ok && positionTester.testSymmetricX();
		ok = ok && positionTester.testTranslate();
		
		
		SegmentTests segmentTester = new SegmentTests ();
		ok = ok && segmentTester . testLength ();
		System.out.println( ok ? " All tests OK" : " At least one test KO");
		System . out . println ( ok ? "All tests OK " : "At least one test KO");
	}

}
