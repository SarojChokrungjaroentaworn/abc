package testFramework;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class MyFirstFramework extends BaseClass{
	
	@Test
	public void testFramework() {
		BaseClass.getDriver();
	}

}
