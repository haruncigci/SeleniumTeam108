package HGSAH.day02_webElements_Locator;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utillities.TestBase;

public class örnekSorular6 extends TestBase {
    @Test public void sour6(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//a[@href=\"/contact_us\"]")).click();
        //5. Verify 'GET IN TOUCH' is visible
        WebElement touch=driver.findElement(By.xpath("(//h2[@class=\"title text-center\"])[2]"));
        Assert.assertTrue(touch.isDisplayed());
        //6. Enter name, email, subject and message
        WebElement name=driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]"));
        Actions action=new Actions(driver);
        Faker faker=new Faker();
        action.click(name)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.job().title())
                .sendKeys(Keys.TAB)
                .sendKeys("Merhaba Selenium" )
                .sendKeys(Keys.TAB).perform();
        String dinamikKisayolu=System.getProperty("user.home")+"C:\\Users\\cigci\\OneDrive\\Desktop\\IT";
        WebElement cooseButonu=driver.findElement(By.xpath("//input[@name=\"upload_file\"]"));
        cooseButonu.sendKeys(dinamikKisayolu);
        bekle(5);
        //7. Upload file

        //8. Click 'Submit' button
        //9. Click OK button
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        //11. Click 'Home' button and verify that landed to home page successfully
    }
}
