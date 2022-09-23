package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import starter.Pages.InventoryPages;
import starter.Pages.LoginPages;
import static org.junit.Assert.assertEquals;


public class SortItemStepDef{

    InventoryPages InventoryPages;
    LoginPages LoginPages;



    @When("User landing on inventory page")
    public void UserDirectedToInventoryPage() {
        LoginPages.open();
        LoginPages.InputUsername("standard_user");
        LoginPages.InputPassword("secret_sauce");
        LoginPages.clickButton();
    }

    @And("User navigate to filter icon")
    public void UserNavigateToFilterIcon () {InventoryPages.isFilterVisible();}

    @And("User click sort by {string}")
    public void UserClickSortBy (String sortBy) {InventoryPages.selectsortBy(sortBy);}

    @Then("Item filtered by {string}")
    public void ItemFilteredBy (String string) {InventoryPages.getActiveSort();
        assertEquals(string, InventoryPages.getActiveSort());}
    }







