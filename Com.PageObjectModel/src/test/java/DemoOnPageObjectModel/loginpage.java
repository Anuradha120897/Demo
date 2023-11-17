package DemoOnPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

                   //without page factory using By().method

public class loginpage {
	
	
	WebDriver driver;

	public loginpage(WebDriver driver) {
	
		this.driver=driver;
	}

	By username = By.xpath("//input[@id='user_name']");
	By Password = By.xpath("//input[@id='user_password']");
	By login = By.xpath("//input[@id='login_button']");
	

	public void enterusname(String usname) {
		
		driver.findElement(username).sendKeys(usname);
	}

     public void enterpass(String pass) {
		
		driver.findElement(Password).sendKeys(pass);
	}
     public void Clickonloginbtn() {
 		
 		driver.findElement(login).click();
 	}
}
