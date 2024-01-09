package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AdminPage {
	public AdminPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//nav[@aria-label='Topbar Menu']/ul/li")
	public List<WebElement> adminPageTopBarMenuOptions;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addButtonInUserManagement;
	
	@FindBy(xpath="//nav[@aria-label='Topbar Menu']/ul/li[2]")
	public WebElement job;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li")
	public List<WebElement> adminPageUserManagementDropdownMenuOptions;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li")
	public List<WebElement> adminPageDropdownMenuOptions;
	
	@FindBy(xpath="//div[@class='oxd-form-row']/div[1]/div[1]")
	public WebElement userManagement_UserRoleTextBox;
	
	@FindBy(xpath="//div[@role='listbox']/div[2]")
	public WebElement userManagement_UserRole_Admin;
	
	@FindBy(xpath="//div[@role='listbox']/div")
	public List<WebElement> userRoleDropdownMenuOptions;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement userManagement_EmployeeName;
	
	@FindBy(xpath="//div[@role='listbox']/div")
	public List<WebElement> userManagement_EmployeeName_select;

	@FindBy(xpath="//div[@role='listbox']/div")
	public List<WebElement> userManagement_Status_Menu;
	
	@FindBy(xpath="//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[3]/div[1]/div[2]")
	public WebElement userManagement_Status;
	
	@FindBy(xpath="//div[@role='listbox']/div[2]")
	public WebElement userManagement_Status_Enabled;
	
	
	@FindBy(xpath="//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[4]/div[1]/div[2]/input")
	public WebElement userManagement_UserRole_UserName;
	
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']/div[1]/div[2]/input")
	public WebElement userManagement_UserRole_Password;
	
	@FindBy(xpath="//div[@class='oxd-form-row user-password-row']/div[1]/div[2]//input")
	public WebElement userManagement_UserRole_Confirm_Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement userManagement_UserRole_Submit_Button;
	
	
	
	
	
	
}
