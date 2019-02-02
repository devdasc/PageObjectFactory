package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePOF {

	WebDriver driver;

	public RediffHomePagePOF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//u[contains(text(),'Search')]")
	WebElement searchLink;
	
	@FindBy(id="srchword")
	WebElement searchTxtBox;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement submitSearch;

	public WebElement searchLink() {
		return searchLink;
	}

	public WebElement searchTxtBox() {
		return searchTxtBox;
	}
	public WebElement submitSearch() {
		return submitSearch;
	}

}
