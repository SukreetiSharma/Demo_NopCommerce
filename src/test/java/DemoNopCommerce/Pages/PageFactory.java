package DemoNopCommerce.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddProductToCard addproduct;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public AddProductToCard getAddProduct(){
        if(addproduct == null){
            addproduct = new AddProductToCard(driver);
        }
        return addproduct;
    }


}
