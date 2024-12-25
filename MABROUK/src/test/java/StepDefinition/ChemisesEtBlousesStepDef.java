package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ChemisesEtBlousesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemisesEtBlousesStepDef {

	@Given("user is on page {string}")
	public void user_is_on_page(String ProductName) throws Exception {
		Config.driver = new ChromeDriver();
	    Config.maximizeWindow();
	    Config.driver.get("https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/");
	   
	}

	@When("user click on product {string}")
	public void user_click_on_product(String ProductName) {
	   ChemisesEtBlousesPage product = new ChemisesEtBlousesPage();
	   product.ClickOnProductName(ProductName);
	   
	   
	}

	@Then("user checks the product {string} in the cart")
	public void user_checks_the_product_in_the_cart(String verifcart) {
		ChemisesEtBlousesPage product = new ChemisesEtBlousesPage();
		   product.ClickOnProductName(verifcart);
}
}
