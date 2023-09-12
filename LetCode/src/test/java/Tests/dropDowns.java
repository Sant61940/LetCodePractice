package Tests;



import core.BaseClass;
import pages.SelectPages;

public class dropDowns extends BaseClass{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				initializeDriver();
				driver.get("https://letcode.in/dropdowns");
				System.out.println(driver);
				
				SelectPages work = new SelectPages();
				work.selectByVisible("Orange");
				work.printAll();
				work.MultipleValue();
				work.SelectingLang();
				work.SelectCountry("Chile");
				
	}

}
