package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InventoryPages extends PageObject {
    @Managed
    WebDriver driver = getDriver();



    private final By addToCart = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By ItemName = By.cssSelector("#item_3_title_link > div");
    private final By CartIcon = By.id("shopping_cart_container");

    private final By Filtericon = By.cssSelector
            ("#header_container > div.header_secondary_container > div.right_component > span > select");
    private final By Sortinglist = By.className("product_sort_container");
    private final By sortActive = By.className("active_option");
    private final By InventoryTitle = By.className("title");

    public void ProductTitle () {driver.findElement(InventoryTitle).isDisplayed();}
    public void Navigatetotitem() {driver.findElement(ItemName).click();}
    public void addtoCartButton () {driver.findElement(addToCart).click();}
    public void clickcarticon () {driver.findElement(CartIcon).click();}


    public boolean isFilterVisible () {return driver.findElement(Filtericon).isDisplayed();}

    public void selectsortBy (String string){;
        Select dropdown = new Select(driver.findElement(Sortinglist));
        dropdown.selectByValue("za");}

    public String getActiveSort () {return driver.findElement(sortActive).getAttribute("innerHTML");}
    public String getUrl() {
        return driver.getCurrentUrl();
    }









    }


