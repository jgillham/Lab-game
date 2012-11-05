

import org.junit.Test;


public class DesktopStartUpTest {

	@Test
	public void testMain(String insert) {
		String expected="y";
		if (!(expected.equals(insert))) {
			System.out.println("Exit game...");
		}
		//Assert.fail("Exit Game...");
	}

}
