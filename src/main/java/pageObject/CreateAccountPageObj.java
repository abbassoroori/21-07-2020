package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DBUtility;

public class CreateAccountPageObj extends Base {
	public CreateAccountPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//input[@name='email'])[1]")
	private WebElement enterEmail;
	@FindBy(how = How.XPATH, using = "(//input[@name='agree'])[1]")
	private WebElement agreeCheckBox;
	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary'])[1]")
	private WebElement sendButton;
	@FindBy(how = How.XPATH, using = "(//button[@class='btn popup-close'])[1]")
	private WebElement closeBox;

	public void clickOnSendButton() {
		DBUtility.clickonElement(sendButton);
	}

	public void enterEmail(String email) {
		DBUtility.enterText(enterEmail, email);
	}

	public boolean isAgreeBoxSelected() {
		boolean isAgreeBoxSelected = agreeCheckBox.isSelected();
		return isAgreeBoxSelected;
	}

	public void clickOnCloseBox() {
		DBUtility.clickonElement(closeBox);
	}

	public void clickOnAgreeButton() {
		DBUtility.clickonElement(agreeCheckBox);
	}

	public void pupopAccept() {
		DBUtility.acceptAlert();
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String geturl() {
		String url = driver.getCurrentUrl();
		return url;
	}
}
