package DemoNopCommerce.Tests;

import DemoNopCommerce.Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.IOException;

public class BaseClass {
    public static WebDriver driver;
    protected static DemoNopCommerce.Pages.PageFactory pageFactory;

    @Parameters("browserName")
    @BeforeClass
    public static void setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            pageFactory = new DemoNopCommerce.Pages.PageFactory(driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            pageFactory = new PageFactory(driver);
        }
    }
    @AfterClass
    public static void close(){
        driver.close();
    }
    public void failed()
    {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("/C:/Users/SukreetiSharma/Documents/ProjectScreenShots/"
                    + "Fail_Screenshots"+ srcFile.getName()+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}