package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ChemisesEtBlousesPage {

	@FindBy (xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> productList;
	
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/ol/li[3]/span")
	WebElement verifproduct;
	
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span")
	List<WebElement> colors;
	
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[1]")
	WebElement selectcolor;
	
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span")
	List<WebElement> size;
	
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[2]")
	WebElement selectsize;
	
	@FindBy (xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/ul/li/div/a")
	WebElement verifcart;
	
	@FindBy (xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[2]")
	WebElement btncommand;
	
public ChemisesEtBlousesPage () {
	PageFactory.initElements(Config.driver, this);
}

public void ClickOnProductName (String ProductName) {
	try {
	for (WebElement product:productList) {
		if(product.getText().contains(ProductName)) {
			product.click();
			Config.attente(10);
			selectcolor.click();
			selectsize.click();
			addtocart.click();
			WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btncommand));
			Config.attente(10);
			String actualtext= verifcart.getText();
			Assert.assertEquals(ProductName, actualtext);
			
		}
	}
}catch (Exception e) {

}
}
}
