

import org.junit.Test;


public class DesktopStartUpTest {

	@Test
	public boolean testMain(String insert) {
		String expected="n";
		if (expected.equals(insert)) {
				return true;		
				}
		return false;
		//Assert.fail("Exit Game...");
	}

}
