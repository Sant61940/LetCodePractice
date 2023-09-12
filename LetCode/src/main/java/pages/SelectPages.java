package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.BaseClass;

public class SelectPages extends BaseClass {
	public SelectPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="fruits")
	WebElement visibleText;
	public void selectByVisible(String S) {
		Select select = new Select(visibleText);
		select.selectByVisibleText(S);


	}
	public void printAll(){
		Select select1 = new Select(visibleText);

		List<WebElement> AB11 = select1.getOptions();

		for(WebElement words : AB11) {
			System.out.println(words.getText());
		}
	}

	@FindBy(id="superheros")
	WebElement multipleValueSelection;
	public void MultipleValue() {
		Select select2 = new Select(multipleValueSelection);
		Boolean True = select2.isMultiple();
		System.out.println(True);
	}

	@FindBy(id ="lang")
	WebElement programLang;
	public  void SelectingLang() {
		Select select3 = new Select(programLang);
		select3.selectByIndex(4);
		WebElement selectedvalue = select3.getFirstSelectedOption();
		System.out.println(selectedvalue.getText());


	}
	@FindBy(id = "country")
	WebElement Coutries;
	public void SelectCountry(String A) {
		Select select4 = new Select(Coutries);
		select4.selectByValue(A);
		WebElement selected = select4.getFirstSelectedOption();
		System.out.println(selected.getText());
	}

}
