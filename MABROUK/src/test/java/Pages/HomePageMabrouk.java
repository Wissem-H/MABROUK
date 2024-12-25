package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageMabrouk {
@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
List<WebElement> menus;

@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[3]/div/ul/li/a/span")
List<WebElement> submenus;

@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/h1")
WebElement verifpage;

public HomePageMabrouk() {
	PageFactory.initElements(Config.driver, this);
}
public void mouseHoverOnMenuAndClick (String menutitle, String submenutitle) {
try {
	for(WebElement menu:menus) {
		if(menu.getText().contains(menutitle)) {
			Config.actions = new Actions(Config.driver);
			Config.actions.moveToElement(menu).perform();
			Thread.sleep(6000);
		}
	}
	for(WebElement submenu:submenus) {
		if(submenu.getText().contains(submenutitle)) {
			submenu.click();
		}
	}
}catch (Exception e) {}
}
public void veriftitle(String submenutitle) {
	Assert.assertEquals(submenutitle, verifpage.getText());
}
	}
