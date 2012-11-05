

import org.junit.Test;


public class DesktopStartUpTest {

	@Test
	public boolean testMain1(String insert) {
		String expected="n";
		if (expected.equals(insert)) {
				return true;		
				}
		return false;
		//Assert.fail("Exit Game...");
	}
	@Test
	public boolean testMain2(String insert) {
		String expected="y";
		if (expected.equals(insert)) {
				return true;		
				}
		return false;
		//Assert.fail("Exit Game...");
	}


}
