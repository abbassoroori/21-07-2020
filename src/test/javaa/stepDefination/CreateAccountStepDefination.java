package stepDefination;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObject.CreateAccountPageObj;

public class CreateAccountStepDefination extends Base{
	CreateAccountPageObj pageObj=new CreateAccountPageObj();
	
	@Given("^User is on the ECommerc site$")
	public void user_is_on_the_ECommerc()throws Throwable {Base.initializeDriver();}
	@When("^User Enter Email'fhgfhf@yahoo.com' the releated Box$")
	public void user_Enter_Email_the_releated_Box(String email) throws Throwable
	{pageObj.enterEmail(email);}
	@When("^Click on Agree Check Box if its non selected$")
	public void click_Agree_Check_Box() throws Throwable{if (!pageObj.isAgreeBoxSelected())
	{pageObj.clickOnAgreeButton();}}
	@When("^Click on Send Button$")
	public void click_Send_Button() throws Throwable
	{pageObj.clickOnSendButton();}
	@When("^Switch to First Alert$")
	public void switch_First_Alert() throws Throwable{driver.switchTo().alert();}
	@When("^Accept the First Alert$")
	public void accept_First_Alert()throws Throwable
	{pageObj.pupopAccept();}
	@When("^Accept The Second Alert$")
	public void accept_Second_Alert() throws Throwable
	{pageObj.pupopAccept();}
	@When("^Click on Close box$")
	public void Click_Close_box()throws Throwable
	{pageObj.clickOnCloseBox();}
	

		
	}
	
	
	
	
	
	
	
	


