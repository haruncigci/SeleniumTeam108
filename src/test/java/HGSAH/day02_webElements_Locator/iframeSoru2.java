package HGSAH.day02_webElements_Locator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utillities.TestBase;

public class iframeSoru2 extends TestBase {

    String https="//https:www.";

    @Test public void test01(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        //2 ) Bir metod olusturun: iframeTest
            driver.get("https://the-internet.herokuapp.com/iframe");


        //- “An IFrame containing….” textinin erisilebilir oldugunu test edin konsolda yazdirin.
        WebElement containing=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(containing.isEnabled());
        System.out.println(containing.getText());
        WebElement iframeElementi=driver.findElement(By.id("mce_0_ifr"));
        //- Text Box’a “Merhaba Dunya!” yazin.
        driver.switchTo().frame(iframeElementi);

        driver.findElement(By.tagName("p")).sendKeys("Merhaba Dünya");

        driver.switchTo().parentFrame();

        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        WebElement elementelSelenium=driver.findElement(By.partialLinkText("Elemental Selenium"));

        //gorunur oldugunu dogrulayin ve konsolda yazdirin.
        Assert.assertTrue(elementelSelenium.isDisplayed());

        System.out.println("ElementalSeleium:" +elementelSelenium.getText());
    }

}
