package DemoNopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddProductToCard {
    WebDriver driver;
    WebDriverWait wait;
    By Computer = By.xpath("(//a[@href='/computers'])[1]");
    By Notebook = By.xpath("(//a[@href='/notebooks'])[1]");
    By Verify  = By.xpath("//div[@class='details']");
    By AddToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
    By button = By.xpath("//button[@id='add-to-cart-button-4']");
    By cart = By.xpath("//span[@class='cart-label']");
    By checkBox =By.xpath("//input[@name='termsofservice']");
    public AddProductToCard(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public void addProductToCard(){
        WebElement ele = driver.findElement(Computer);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Notebook));
        driver.findElement(Notebook).click();
        List<WebElement> myElements = driver.findElements(Verify);
        for(WebElement e : myElements) {
            System.out.println(e.getText());
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCart));
        driver.findElement(AddToCart).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(button));
        driver.findElement(button).click();
        driver.findElement(cart).click();
        driver.findElement(checkBox).click();
    }
}