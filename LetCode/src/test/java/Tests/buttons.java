package Tests;

import core.BaseClass;
import pages.ButtonsPage;

public class buttons extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeDriver();
		driver.get("https://letcode.in/buttons");
		System.out.println(driver);
		
		ButtonsPage but = new ButtonsPage();
		but.buttonClick();
		but.colorget();
		but.disabled();
		but.Prop();
		but.PositionFind();
		
		
		closeDriver();
	}

}
