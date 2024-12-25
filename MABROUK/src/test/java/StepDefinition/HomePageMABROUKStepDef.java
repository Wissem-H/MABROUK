package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePageMabrouk;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageMABROUKStepDef {

	
	   @Given("user is on home page")
	   public void user_is_on_home_page() throws Exception {
		   Config.driver= new ChromeDriver();
		   Config.maximizeWindow();
		   Config.driver.get("https://mabrouk.tn/");
	   }

	   @When("user hovers the mouse over the menu {string} and clicks on submenu {string}")
	   public void user_hovers_the_mouse_over_the_menu_and_clicks_on_submenu(String menutitle, String submenutitle) {
	     HomePageMabrouk page = new HomePageMabrouk();
	    		 page.mouseHoverOnMenuAndClick(menutitle, submenutitle);
	   }

	   @Then("user is directed to submenu page {string}")
	   public void user_is_directed_to_submenu_page(String veriftitle) {
		   HomePageMabrouk page = new HomePageMabrouk();
  		 page.veriftitle(veriftitle);
	   
	}
}
