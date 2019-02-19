package com.cgg.testcases;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cgg.pages.Homepage;
import com.cgg.pages.contractregpages;
import com.cgg.util.TestUtil;
import com.cgg.testcases.TestBase;

public class contractreg extends TestBase{
	public WebDriver driver;
	
	
  @Test(dataProvider="getData")
  public void f(Hashtable<String, String> data){
	  
	  if (!TestUtil.isExecutable(this.getClass().getSimpleName(), xls) || data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
	  
	 //System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	  driver.get("http://testnew.cgg.gov.in:8089/tscot/");
	  APP_LOGS.info("going to hit given url");
	  Homepage home=PageFactory.initElements(driver, Homepage.class);
	   home.clickoncontractreglink();
	  contractregpages contractreg=PageFactory.initElements(driver, contractregpages.class);
	 contractreg.selectclassname(data.get("selectclassname"));
	  contractreg.selectcategory(data.get("selectcategory"));
	  contractreg.selectContractorType(data.get("selectContractorType"));
	  contractreg.sendname(data.get("sendname"));
	  contractreg.sendpannumber(data.get("sendpannumber"));
	  contractreg.sendgstnumber(data.get("sendgstnumber"));
	  contractreg.sendmobilenumber(data.get("sendmobilenumber"));
	  contractreg.sendemailid(data.get("sendemailid"));
	  contractreg.sendempid(data.get("sendempid"));
	  contractreg.sendnameofemployee(data.get("sendnameofemployee"));
	  contractreg.sendAadhaarNumber(data.get("sendAadhaarNumber"));
	  contractreg.selectRelationWithFirmCompany(data.get("selectRelationWithFirmCompany"));
	  contractreg.sendemployeepannumber(data.get("sendemployeepannumber"));
	  contractreg.sendemployeemobilenumber(data.get("sendemployeemobilenumber"));
	  contractreg.sendemployeemailidnumber(data.get("sendemployeemailidnumber"));
	 // contractreg.clickoncontractregsubmitbutton();
	  
	  
	   
  }
  @DataProvider
	public Object[][] getData() {
		return TestUtil.getData(this.getClass().getSimpleName(), xls);
	}
}
