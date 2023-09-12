package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class FramePage extends BaseClass{
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	WebElement EnterName;

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	WebElement LastName;

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	WebElement EnterEmail;

	public void enterName(String str, String ab) {

		// TODO Auto-generated method stub
		driver.switchTo().frame(0);
		EnterName.sendKeys(str);
		LastName.sendKeys(ab);

	}


	public void enterMail(String km) {
		WebElement myFrame = driver.findElement(By.cssSelector("iframe[class='has-background-white']"));
		driver.switchTo().frame(myFrame);
		EnterEmail.sendKeys(km);
		driver.switchTo().defaultContent();
	}
	public FramePage() {
		PageFactory.initElements(driver, this);
	}
}
