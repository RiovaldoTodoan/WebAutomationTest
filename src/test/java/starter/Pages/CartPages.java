package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPages extends PageObject {

    @Managed
    WebDriver driver = getDriver();
    private final By itemOnCart = By.className("cart_quantity"); //quantity
    private final By intemInCart = By.className("inventory_item_name");
    private final By removeButton = By.id("remove-test.allthethings()-t-shirt-(red)");
    private final By continueButton = By.id( "continue-shopping");
    private final By itemremoved = By.className("removed_cart_item");


    public void itemVisibleOnCart () {driver.findElement(itemOnCart).isDisplayed();}
    public void clickRemoveButton () {driver.findElement(removeButton).click();}

    public void clickContinueButton () {driver.findElement(continueButton).click();}

    public void ItemRemovedFromCart () {driver.findElement(itemremoved).isDisplayed();
    }
    public void ItemDesc () {driver.findElement(intemInCart).isDisplayed();}


    public String getUrl() {
        return driver.getCurrentUrl();
    }

}

