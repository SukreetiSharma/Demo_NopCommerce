package DemoNopCommerce.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddProductToCard addProduct;
    private AddToCart addToCart;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }
    public AddProductToCard getAddProduct(){
        if(addProduct == null){
            addProduct = new AddProductToCard(driver);
        }
        return addProduct;
    }
    public AddToCart getAddToCart(){
        if(addToCart == null){
            addToCart = new AddToCart(driver);
        }
        return addToCart;
    }
}
