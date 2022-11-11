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

public class AddProductToCard {
    WebDriver driver;
    WebDriverWait wait;
    String s = RandomStringUtils.randomAlphabetic(8);
    By Computer = By.xpath("(//a[@href='/computers'])[1]");
    By Notebook = By.xpath("(//a[@href='/notebooks'])[1]");
    By Verify  = By.xpath("//div[@class='product-grid']");
    By AddToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
    By button = By.xpath("//button[@id='add-to-cart-button-4']");
    By cart = By.xpath("//span[@class='cart-label']");
    By checkBox =By.xpath("//input[@name='termsofservice']");
    By Checkout =By.xpath("//button[@name='checkout']");
    By Register = By.xpath("//button[contains(text(),'Register')]");
    By Gender = By.xpath("(//input[@name='Gender'])[1]");
    By Firstname = By.xpath("//input[@name='FirstName']");
    By LastName = By.xpath("//input[@name='LastName']");
    By Email = By.xpath("//input[@name='Email']");
    By Password = By.xpath("//input[@name='Password']");
    By Confirm = By.xpath("//input[@name='ConfirmPassword']");
    By Reg = By.xpath("//button[contains(text(),'Register')]");
    By Continue = By.xpath("//a[contains(text(),'Continue')]");
    By save = By.xpath("//button[contains(text(),'Save')]");
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
        int count = myElements.size();
        System.out.println(count);
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCart));
        driver.findElement(AddToCart).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(button));
        driver.findElement(button).click();
        driver.findElement(cart).click();
        driver.findElement(checkBox).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Checkout));
        driver.findElement(Checkout).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Register));
        driver.findElement(Register).click();
        driver.findElement(Gender).click();
        driver.findElement(Firstname).sendKeys(s);
        driver.findElement(LastName).sendKeys(s);
        driver.findElement(Email).sendKeys("qwerty@gmail.com");
        driver.findElement(Password).sendKeys("qwerty");
        driver.findElement(Confirm).sendKeys("qwerty");
        driver.findElement(Reg).click();
        driver.findElement(Continue).click();
        driver.findElement(save).click();
    }
}