package Tests;




import core.BaseClass;
import pages.InputPage;

public class input extends BaseClass {

	public static void main(String[] args) {
		initializeDriver();
		driver.get("https://letcode.in/edit");
		System.out.println(driver);


		InputPage page1 = new InputPage();
		page1.enterUsername("Santhosh Raj");
		page1.appendText("sant");
		page1.GetVelue();
		page1.clear();

		page1.Enabled();
		page1.Editable();
		
		
		closeDriver();
		// Add assertions or further test steps here


	}
}
