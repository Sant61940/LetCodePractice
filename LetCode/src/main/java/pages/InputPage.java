package pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.BaseClass;

public class InputPage extends BaseClass{
	@FindBy(id = "fullName")
	private WebElement EnterName;

	@FindBy(id = "join")
	private WebElement append;

	@FindBy(id = "getMe")
	private WebElement getVelue;

	@FindBy(id = "clearMe")
	private WebElement clearValue;

	@FindBy(id = "noEdit")
	private WebElement FieldDisabled;

	@FindBy(id = "dontwrite")
	private WebElement editableOrNot;

	public InputPage() {

		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String username) {
		EnterName.sendKeys(username);
	}
	public void appendText(String appen) {
		append.sendKeys(appen + Keys.TAB);
	}

	public void GetVelue() {
		String value = getVelue.getAttribute("value");
		System.out.println(value);
	}

	public void clear() {
		clearValue.clear();
	}

	public void Enabled() {
		Boolean True =	FieldDisabled.isEnabled();
		System.out.println(True);
	}

	public void Editable() {
		String Ed =editableOrNot.getAttribute("readonly");
		System.out.println(Ed);
	}

}
