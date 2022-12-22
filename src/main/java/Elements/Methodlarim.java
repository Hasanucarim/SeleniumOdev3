package Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import static javax.swing.UIManager.get;

public class Methodlarim extends Driver {


    static Constants constants = new Constants();


    public static void ChromeBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = WebDriverManager.chromedriver().avoidShutdownHook().capabilities(chromeOptions).create();
        driver.get(constants.URL);
    }


    public static void goToURL() {
        driver.get(constants.URL);

    }

    public static void sendKeysToSearchEngine() {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 11 (128 GB) - Siyah");//initializing


    }

    public static void search () {

        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();
    }

    public static void find() {
        WebElement find = driver.findElement(By.linkText("Apple iPhone 11 (128 GB) - Siyah"));
        find.click();
    }

   public static void addBasket() {
        WebElement addBasket = driver.findElement(By.id("add-to-cart-button"));
        addBasket.click();
    }

    public static void finishShopping() {

        WebElement finishShopping = driver.findElement(By.xpath("//*[@id=/attach-sidesheet-checkout-button/][1]"));
        finishShopping.click();

    }
    public static void login() throws InterruptedException {
        WebElement login = driver.findElement(By.xpath("//form/div[1]/div[1]/div[1]/div[1]/input/@name"));
        login.click();

        driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys(constants.EMAIL);
        driver.findElement(By.className("a-form-label")).sendKeys(constants.PASS);

        WebElement clickLogin = driver.findElement(By.id("signInSubmit"));
        Thread.sleep(3000);

        clickLogin.click();

    }


}