package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utillities.TestBase;

import java.security.Key;

public class C05_TestBaseIlkTest extends TestBase {
@Test public void test01(){
    //amazona Gidelim
    driver.get("https://amazon.com/");
    //Nutella aratalim
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
    //Sonuclarini Nutella icerdigini test edelim
    WebElement actualSonucYaziElement= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
    String expectedIcerik="Nutella";
    String actualSonucYazisi=actualSonucYaziElement.getText();
    Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
}


}
