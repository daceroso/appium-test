package com.appium.pages;

import com.appium.utils.GlobalParams;
import com.appium.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends MenuPage {

	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]\n" + 
			"")
	private WebElement title;

	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]"
			+ "") 
	private WebElement desc;

	@AndroidFindBy (accessibility = "test-BACK TO PRODUCTS") 
	private WebElement backToProductsBtn;




public String getTitle() {
	return getText(title, "title is: ");
}

public String getDesc() {
	return getText(desc, "description is: ");
}

public String getPrice() throws Exception {
	switch(new GlobalParams().getPlatformName()){
		case "Android":
			return getText(andScrollToElementUsingUiScrollable("description", "test-Price"), "price is: ");

		default:
			throw new Exception("Invalid platform name");
	}
}




}
