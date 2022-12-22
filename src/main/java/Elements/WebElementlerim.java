package Elements;

import static Elements.Driver.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebElementlerim {

    static WebElement search = driver.findElement(By.id("nav-search-submit-button"));
    static WebElement find = driver.findElement(By.linkText("Apple iPhone 11 (128 GB) - Siyah"));
    static WebElement addBasket= driver.findElement(By.id("add-to-cart-button"));
    static WebElement finishShopping= driver.findElement(By.xpath("//*[@id=/attach-sidesheet-checkout-button][1]"));
    static WebElement login = driver.findElement(By.xpath("//form/div[1]/div[1]/div[1]/div[1]/input/@name"));







}
