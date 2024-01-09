package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage {
	
	public DashboardPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']/h6")
	public WebElement dashBoardText;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li")
	public List<WebElement> userNameMenuOptions;
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li")
	public List<WebElement> leftDashboardMenuOptions;
}
