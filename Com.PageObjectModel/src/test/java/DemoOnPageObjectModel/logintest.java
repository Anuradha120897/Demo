package DemoOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	
public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
WebDriver driver = new ChromeDriver();

loginpage2 lp2 = new loginpage2(driver);

 driver.get("https://ingecnotechnologies.com/WebStockCRM/index.php?action=Login&module=Users&login_module=Cases&login_action=index");       
 lp2.enterusname("admin");
 lp2.enterpass("pass");
 lp2.Clickonloginbtn();

}

}
