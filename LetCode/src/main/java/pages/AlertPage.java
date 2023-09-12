package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class AlertPage extends BaseClass{
	
@FindBy(id="accept")
public  WebElement Accept;

@FindBy(id="confirm")
public  WebElement Confirm;

@FindBy(id="prompt")
public  WebElement Prompt;

@FindBy(id="modern")
public  WebElement ModernAlert;

public void Alertpage() {
	PageFactory.initElements(driver, this);
	}
}
