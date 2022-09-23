package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import starter.Pages.CartPages;
import starter.Pages.InventoryPages;
import starter.Pages.LoginPages;

import static org.junit.Assert.assertEquals;

public class CartStepDef {
    InventoryPages InventoryPages;
    CartPages CartPages;
    LoginPages LoginPages;


    //scenario 1

    @Given("User already login")
    public void UserAlreadyLogin () {
        LoginPages.open();
        LoginPages.InputUsername("standard_user");
        LoginPages.InputPassword("secret_sauce");
        LoginPages.clickButton();
    }
    @When("User select an item")
    public void UserSelectAnItem() {InventoryPages.Navigatetotitem();}

    @And("User click add to cart button")
    public void UserAddClickToCartButton() {InventoryPages.addtoCartButton();}

    @And("User click cart icon button")
    public void UserClickCartIconButton() {InventoryPages.clickcarticon();}

    @Then("Item added to cart")
    public void ItemAddedToCart () {CartPages.itemVisibleOnCart();}


    //scenario 2


    @Given("Item added in cart")
    public void ItemAddedInCart () {
        CartPages.itemVisibleOnCart();

    }
    @When("User navigate to an item")
    public void UserNavigateToAnItem() {
        CartPages.ItemDesc();
    }
    @And("User click remove button")
    public void UserClickRemoveButton() {CartPages.clickRemoveButton();
    }
    @Then("Item removed from cart")
    public void ItemRemovedFromCart() { CartPages.ItemRemovedFromCart();}

    //Scenario 3

    @Given("Item deleted from cart")
    public void ItemDeletedFromCart () {
        CartPages.ItemRemovedFromCart();


    }
    @When("User click continue shopping")
    public void UserClickContinueShopping() {CartPages.clickContinueButton();}

    @Then("User landing to inventory page")
    public void UserLandingToInventoryPage ()
    {InventoryPages.ProductTitle();}
}

