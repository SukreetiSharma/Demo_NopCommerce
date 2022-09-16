package DemoNopCommerce.Tests;

import org.testng.annotations.Test;

public class TestAddProduct extends BaseClass{

    @Test
    public void testAddProduct(){
        pageFactory.getAddProduct().addProductToCard();
    }
}