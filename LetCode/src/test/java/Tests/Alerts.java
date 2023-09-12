package Tests;

import org.openqa.selenium.Alert;
import core.BaseClass;
import pages.AlertPage;

public class Alerts extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeDriver();
		driver.get("https://letcode.in/alert");
		System.out.println(driver);
		AlertPage APage = new AlertPage();
		APage.Alertpage();



		APage.Accept.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		APage.Confirm.click();
		Alert alert1 = driver.switchTo().alert();
		String msg = alert1.getText();
		System.out.println(msg);
		alert1.dismiss();

		APage.Prompt.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Santhosh");
		alert2.accept();








	}

}