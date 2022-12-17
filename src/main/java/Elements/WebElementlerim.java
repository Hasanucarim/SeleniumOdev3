package Elements;

import static Elements.Driver.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebElementlerim {

    static WebElement search = driver.findElement(By.id("nav-search-submit-button"));
    static WebElement basket= driver.findElement(By.className("a-icon a-icon-cart"));
    static WebElement login = driver.findElement(By.xpath("//form/div[1]/div[1]/div[1]/div[1]/input/@name"));







}
