package Tests;



import core.BaseClass;
import pages.FramePage;

public class Frames extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeDriver();
		driver.get("https://letcode.in/frame");
		System.out.println(driver);

		FramePage framePage = new FramePage();
		framePage.enterName("Santhosh", "Raj B");
		framePage.enterMail("Sant.61940@gmail.com");
	}

}
