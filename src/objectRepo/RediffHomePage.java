package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By searchLink = By.xpath("//u[contains(text(),'Search')]");

	By searchTxtBox = By.id("srchword");

	By submitSearch = By.xpath("//input[@value='Search']");

	public WebElement searchLink() {
		return driver.findElement(searchLink);
	}

	public WebElement searchTxtBox() {
		return driver.findElement(searchTxtBox);
	}
	public WebElement submitSearch() {
		return driver.findElement(submitSearch);
	}

}
