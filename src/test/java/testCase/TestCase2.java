package testCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.DashboardPage;
import pages.LogInPage;
import utilities.BaseClass;

public class TestCase2 extends BaseClass {
	DashboardPage dp = new DashboardPage();
	AdminPage ap = new AdminPage();

	@Test
	public void tesetCaseHomework() throws InterruptedException {

		BaseClass.getDriver();
		BaseClass.clickOnMenuBar(dp.leftDashboardMenuOptions, BaseClass.getProperty("orangHRM_leftMenuOption1")); 
		BaseClass.clickOnMenuBar(ap.adminPageTopBarMenuOptions, BaseClass.getProperty("AdminPage_TopBarMenu_Option_Selected"));
		BaseClass.clickOnMenuBar(ap.adminPageUserManagementDropdownMenuOptions, BaseClass.getProperty("orangHRM_AdminPage_User_Option_Selected"));
		ap.addButtonInUserManagement.click();
		ap.userManagement_UserRoleTextBox.click();
		BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BaseClass.clickOnMenuBar(ap.userRoleDropdownMenuOptions, "ESS");
//		ap.userManagement_UserRole_Admin.click();
		ap.userManagement_Status.click();
		ap.userManagement_Status_Enabled.click();
		ap.userManagement_EmployeeName.sendKeys("a");
		Thread.sleep(3000);
//		BaseClass.getDriver().findElement(By.xpath("//div[@role='listbox']/div[1]")).click();
		BaseClass.clickOnMenuBarByIndex("//div[@role='listbox']/div", "1");
		BaseClass.clickOnMenuBar(ap.userManagement_Status_Menu, "Enabled");
//		BaseClass.clickOnMenuBar(ap.userManagement_EmployeeName_select, "Odis  Adalwin");
//		BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ap.userManagement_UserRole_UserName.sendKeys("abc123");
		ap.userManagement_UserRole_Password.sendKeys("abc1234567");
		ap.userManagement_UserRole_Confirm_Password.sendKeys("abc1234567");
//		ap.userManagement_UserRole_Submit_Button.click();
		switch(BaseClass.getProperty("AdminPage_TopBarMenu_Option_Selected")) {
		case"1":
			BaseClass.clickOnMenuBar(ap.adminPageDropdownMenuOptions, BaseClass.getProperty("orangHRM_AdminPage_User_Option_Selected"));
		    // Click Add
			ap.addButtonInUserManagement.click();
			ap.userManagement_UserRoleTextBox.click();
			BaseClass.clickOnMenuBar(ap.userRoleDropdownMenuOptions, "ESS");
//		

//			
//			BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			ap.userManagement_UserRole_UserName.sendKeys("abc123");
//			ap.userManagement_UserRole_Password.sendKeys("abc1234567");
//			ap.userManagement_UserRole_Confirm_Password.sendKeys("abc1234567");
//			ap.userManagement_UserRole_Submit_Button.click();
			break;
		case"2":
			BaseClass.clickOnMenuBar(ap.adminPageDropdownMenuOptions, BaseClass.getProperty("orangHRM_AdminPage_Job_Option_Selected"));
			break;
		case"3":
			BaseClass.clickOnMenuBar(ap.adminPageDropdownMenuOptions, BaseClass.getProperty("orangHRM_AdminPage_Organization_Option_Selected"));
			break;
		case"4":
			BaseClass.clickOnMenuBar(ap.adminPageDropdownMenuOptions, BaseClass.getProperty("orangHRM_AdminPage_Qualifications_Option_Selected"));
			break;
		case"5":
		case"6":			
			break;
		case"7":
		BaseClass.clickOnMenuBar(ap.adminPageDropdownMenuOptions, BaseClass.getProperty("orangHRM_AdminPage_Configuration_Option_Selected"));
		break;
		}

	}

//		Assert.assertEquals(dbp.dashBoardText.getText(), "Dashboard");

}

// Project object model
// POM
// is maven management design for the project.
// it's for dependencies, plugins and other properties management

// page object model design pattern
// POM
// it's design pattern to store and keep reusable locators/ and elements in page
// specific class


