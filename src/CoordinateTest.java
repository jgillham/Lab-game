
import org.junit.Test;

import junit.framework.TestCase;


public class CoordinateTest extends TestCase {

	@Test
	public void testCoordinate() {
		//fail("Not yet implemented");
		  try {
			  /*decision's  tree
			   *
			   *first  set of inputs tests all bases cases
			   *  
			   * */
		      new Coordinate(2,0);
		      new Coordinate(0,-1);
		      new Coordinate(2,-1);
		      new Coordinate(-2,3);
		      new Coordinate(0,0);
		      new Coordinate(-2,-1);
		   /*
		    * second  set of inputs tests all limit cases
		    * 
		    */
		      new Coordinate(2,999999999);
		      new Coordinate(999999999,-1);
		      new Coordinate(999999999,999999999);
		      new Coordinate(2,-999999999);
		      new Coordinate(-999999999,-1);
		      new Coordinate(-999999999,-999999999);
		   


		    }
		    catch ( Exception e ) {
		      fail( "Should not throw an exception." );
		    }
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
