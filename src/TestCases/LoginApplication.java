package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import objectRepo.RediffHomePagePOF;
import objectRepo.RediffLoginPagePOF;

public class LoginApplication {
	
	@Test
	public void Login() {
		
		String driverKey = "webdriver.chrome.driver";
		String driverPath = "C:\\Users\\devda\\Documents\\Udemy\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverKey, driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPagePOF rd = new RediffLoginPagePOF(driver);
		
		rd.emailId().sendKeys("username");
		rd.password().sendKeys("pass");
		//rd.submit().click();
		rd.home().click(); // redirects to home page
		
		// instantiate the home page object
		RediffHomePagePOF rh = new RediffHomePagePOF(driver);
		rh.searchLink().click();
		rh.searchTxtBox().sendKeys("rediff");
		rh.submitSearch().click();
		
	}

}
