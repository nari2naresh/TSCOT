package CGG.TSCOT1;

import org.apache.tools.ant.taskdefs.condition.IsTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.cgg.util.WaitUtil;

public class Testing {
	 public WebDriver driver;


  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\driver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	 
	 // driver.get("http://testing.cgg.gov.in/tscetdnew/");
	 // driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/div[2]")).click();
	  
	  driver.get("http://testing.cgg.gov.in/tscetdnew/Login.do");
	  driver.get("http://testing.cgg.gov.in/tscetdnew/Login.do");
	 // Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("guest");
	  driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
	  Thread.sleep(5000);
	 // driver.findElement(By.cssSelector(a[href*='Welcome.do'][id='oldcontent']));
	//driver.findElement(By.xpath("//a[contains(@href,'Welcome.do') and @id='mmlink0']")).click();
	 // Thread.sleep(3000);
	 
	 WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'Welcome.do') and @name='mM1']"));
	System.out.println(ele);
	WebElement ele1 = driver.findElement(By.xpath("//a[contains(@href,'postDynamicdata.do') and @name='mM1']"));
	System.out.println(ele1);
	 Actions action = new Actions(driver);
	 Thread.sleep(3000);
	 action.moveToElement(ele).click().build().perform();
	 WebDriverWait wait = new WebDriverWait(driver, 30);
    // wait.until(ele1);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(ele1));
	 
	 wait.until(ExpectedConditions.invisibilityOf(ele1));
	 
	  //driver.findElement(By.xpath("//a[contains(@href,'options.do') and @name='mM1']")).click();
	 
	 // Thread.sleep(5000);
	action.moveToElement(ele1).click();
	//action.moveToElement(ele1).build().perform();
	
	  
	  
	  
	  
  }
}
