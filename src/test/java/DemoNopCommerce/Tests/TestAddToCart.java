package DemoNopCommerce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToCart extends BaseClass{
    @Test
    public void testAddProduct(){
        pageFactory.getAddToCart().addProductToCard();
    }

    public void takeScreenshotTest()
    {
        Assert.assertEquals(true, false);
    }
}
