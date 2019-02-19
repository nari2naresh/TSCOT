package com.cgg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.contractregconstants;

public class contractregpages {
	private WebDriver driver;
	
	public contractregpages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath=contractregconstants.classfield)
	private WebElement classfield;
	@FindBy(xpath=contractregconstants.Categoryfield)
	private WebElement Categoryfield;
	@FindBy(xpath=contractregconstants.ContractorTypefield)
	private WebElement ContractorTypefield;
	@FindBy(xpath=contractregconstants.Namefield)
	private WebElement Namefield;
	@FindBy(xpath=contractregconstants.PANNumberfield)
	private WebElement PANnumberfield;
	@FindBy(xpath=contractregconstants.GSTnumberfield)
	private WebElement GSTnumberfield;
	@FindBy(xpath=contractregconstants.Mobilenumberfield)
	private WebElement Mobilenumberfield;
	@FindBy(xpath=contractregconstants.EmailIDfield)
	private WebElement EmailIDfield;
	@FindBy(xpath=contractregconstants.EmployeeIdfield)
	private WebElement EmployeeIdfield;
	@FindBy(xpath=contractregconstants.NameoftheEmployeefield)
	private WebElement NameoftheEmployeefield;
	@FindBy(xpath=contractregconstants.AadhaarNumberfield)
	private WebElement AadhaarNumberfield;
	@FindBy(xpath=contractregconstants.RelationWithFirmCompanyfield)
	private WebElement RelationWithFirmCompanyfield;
	@FindBy(xpath=contractregconstants.EmployeePANnumberfield)
	private WebElement EmployeePANnumberfield;
	@FindBy(xpath=contractregconstants.EmployeeMobilenumberfield)
	private WebElement EmployeeMobilenumberfield;
	@FindBy(xpath=contractregconstants.EmployeeEmailIDfield)
	private WebElement EmployeeEmailIDfield;
	@FindBy(xpath=contractregconstants.SubmitbuttonContractreg)
	private WebElement SubmitbuttonContractreg;
	
	public void selectclassname(String classname) {
		this.classfield.sendKeys(classname);
	}
	public void selectcategory (String category) {
		this.Categoryfield.sendKeys(category);
	}
	public void selectContractorType (String ContractorType) {
		this.ContractorTypefield.sendKeys(ContractorType);
	}
	public void sendname (String Name) {
		this.Namefield.sendKeys(Name);
	}
	public void sendpannumber (String Pannumber) {
		this.PANnumberfield.sendKeys(Pannumber);
	}
	public void sendgstnumber (String Gstnumber) {
		this.GSTnumberfield.sendKeys(Gstnumber);
	}
	public void sendmobilenumber (String Mobilenumber) {
		this.Mobilenumberfield.sendKeys(Mobilenumber);
	}
	public void sendemailid (String EmailId) {
		this.EmailIDfield.sendKeys(EmailId);
	}
	public void sendempid (String Employeeid) {
		this.EmployeeIdfield.sendKeys(Employeeid);
	}
	public void sendnameofemployee (String nameofemployee) {
		this.NameoftheEmployeefield.sendKeys(nameofemployee);
	}
	public void sendAadhaarNumber (String AadhaarNumber) {
		this.AadhaarNumberfield.sendKeys(AadhaarNumber);
	}
	public void selectRelationWithFirmCompany (String RelationWithFirmCompany) {
		this.RelationWithFirmCompanyfield.sendKeys(RelationWithFirmCompany);
	}
	public void sendemployeepannumber (String employeepannumber) {
		this.EmployeePANnumberfield.sendKeys(employeepannumber);
	}
	public void sendemployeemobilenumber (String employeemobilenumber) {
		this.EmployeeMobilenumberfield.sendKeys(employeemobilenumber);
	}
	public void sendemployeemailidnumber (String employeemailidnumber) {
		this.EmployeeEmailIDfield.sendKeys(employeemailidnumber);
	}
	public void clickoncontractregsubmitbutton () {
		this.SubmitbuttonContractreg.click();
	}

}
