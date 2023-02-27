package HGSAH.day02_webElements_Locator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utillities.TestBase;

public class cözülenSorular extends TestBase {
    @Test public  void test(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath(" //a[.=' Signup / Login']"));

        //5. Verify 'Login to your account' is visible
        driver.findElement(By.tagName("h2"));

        //6. Enter incorrect email address and password

        //7. Click 'login' button
        //8. Verify error 'Your email or password is incorrect!' is visible
    }
}
