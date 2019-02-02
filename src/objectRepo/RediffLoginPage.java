package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver ;
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By username = By.xpath("//input[@name='login']");
	By password = By.id("password");
	By go = By.name("proceed");
	By home = By.xpath("//a[contains(text(),'Home')]");
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	public WebElement  password() {
		return driver.findElement(password);
	}
	public WebElement  submit() {
		return driver.findElement(go);
	}
	public WebElement  home() {
		return driver.findElement(home);
	}
}
