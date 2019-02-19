package CGG.TSCOT1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class rough {
	 public WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\driver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://testnew.cgg.gov.in:8089/tscot/");
	 // driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
	 driver.findElement(By.className("login-btn")).click();
	  driver.findElement(By.xpath("//a[contains(@href,'/tscot/users/newreg') and @class='login-btn']")).click();
	  
	  
	  
  }
}
