package DemoNopCommerce.Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class AddToCart {
    WebDriver driver;
    WebDriverWait wait;
    String s = RandomStringUtils.randomAlphabetic(8);
    By Computer = By.xpath("(//a[@href='/computers'])[1]");
    By Notebook = By.xpath("(//a[@href='/notebooks'])[1]");
    By Verify  = By.xpath("//div[@class='product-grid']");
    By AddToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-butn'])[1]");
    public AddToCart(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void addProductToCard() {
        WebElement ele = driver.findElement(Computer);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Notebook));
        driver.findElement(Notebook).click();
        List<WebElement> myElements = driver.findElements(Verify);
        int count = myElements.size();
        System.out.println(count);
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCart));
        driver.findElement(AddToCart).click();
    }
}
