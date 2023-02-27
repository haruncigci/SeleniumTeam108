package HGSAH.day02_webElements_Locator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utillities.TestBase;

public class cözülemeyen_sorular5 extends TestBase {
    @Test public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath(" //a[.=' Signup / Login']"));

        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignup=driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(newUserSignup.isDisplayed());
        //6. Enter name and already registered email address
        WebElement name=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        name.sendKeys("Harun");
        WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys("cigciharun@gmail.com");


        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@type='submit'][2]"));
        //8. Verify error 'Email Address already exist!' is visible
        WebElement exist=driver.findElement(By.xpath("//p[.='Email Address already exist!']"));
        Assert.assertTrue(exist.isDisplayed());
    }
}
