package testNG_Day01;

import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(groups = { "SmokeTest" })
	public void testPrint() {
		System.out.println("Test 2");
	}
}
