package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class ButtonsPage extends BaseClass {
	@FindBy(id="home")
	private WebElement Button;

	public void buttonClick() {
		Button.click();
		driver.navigate().back();
	}

	@FindBy (id="position")
	private WebElement XY;

	public void PositionFind() {
		int x =XY.getLocation().getX();
		int y = XY.getLocation().getY();
		System.out.println(x+"  "+y);
	}

	@FindBy(id="color")
	private WebElement colorFinder;

	public void colorget() {
		String col=colorFinder.getCssValue("background-color");
		System.out.println(col);
	}

	@FindBy(id="property")
	private WebElement highWidth;

	public void Prop() {
		int Hieght = highWidth.getSize().getHeight();
		int Width = highWidth.getSize().getWidth();

		System.out.println(Hieght+"  "+Width);
	}


	@FindBy(id="isDisabled")
	private WebElement disabledOrNot;

	public void disabled() {
		String dis = disabledOrNot.getAttribute("disabled");
		System.out.println(dis);
	}
	public ButtonsPage() {

		PageFactory.initElements(driver, this);
	}
}
