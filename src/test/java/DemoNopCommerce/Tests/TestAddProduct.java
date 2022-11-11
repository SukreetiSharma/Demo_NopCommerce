package DemoNopCommerce.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProduct extends BaseClass{

    @Test
    public void testAddProduct(){
        pageFactory.getAddProduct().addProductToCard();
    }
    public void takeScreenshotTest()
    {
        Assert.assertEquals(true, false);
    }
}