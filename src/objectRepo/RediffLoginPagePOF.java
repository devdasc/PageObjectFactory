package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePOF {
	
	WebDriver driver ;
	
	public RediffLoginPagePOF(WebDriver driver) {
		this.driver=driver;
		// need to instatiate when using PageFactory object
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@name='login']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	
	public WebElement emailId() {
		return username;
	}
	public WebElement  password() {
		return password;
	}
	public WebElement  submit() {
		return go;
	}
	public WebElement  home() {
		return home;
	}
}
