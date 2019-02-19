package com.cgg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.homepageconstants;
import com.cgg.util.AssertionsUtil;

public class Homepage {
	private WebDriver driver;
	
	public Homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(name=homepageconstants.loginlink)
	//private WebElement loginlink;
	
	@FindBy(id=homepageconstants.loginlink)
	private WebElement loginlink;
	
	@FindBy(xpath=homepageconstants.contractregistraionlink)
	private WebElement contractreglink;
	
	public boolean ishomepageopened(WebElement element) {
		//AssertionsUtil.isElementPresent(this.UserName);
		try {
			if (element.isDisplayed()
					|| element.isEnabled())
				return true;
			//APP_LOGS.info("--- Element Present ---"+element.getText());
			System.out.println("---Element Present --" + element.getText());
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}

	public void clickoncontractreglink() {
		// TODO Auto-generated method stub
		contractreglink.click();
		
	}


	
	
}
