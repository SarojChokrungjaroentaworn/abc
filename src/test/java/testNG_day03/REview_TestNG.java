package testNG_day03;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class REview_TestNG {
	
	@DataProvider(name="data01")
	public Object[][] dataForTest(){
		return new Object[][] {{"saroj",1},{"Rattakarn",2}};
	}
	
	@Test(groups="sample")
	public void test01() {
		System.out.println("Print from test01");
		AssertJUnit.assertTrue(true);
	}
	
	@Test(dependsOnMethods="test01")
	public void test02() {
		System.out.println("Print from test02");
	}
	@Test(dependsOnGroups="sample")
	public void test03() {
		System.out.println("Print from test03");
	}
	@Test(dataProvider="data01", groups ="sample")
	public void test04(String name, int age) {
		System.out.println("My name is: "+name+", I'm "+age+" years old.");
	}



	
	

}
