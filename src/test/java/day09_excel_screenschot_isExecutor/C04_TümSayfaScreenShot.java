package day09_excel_screenschot_isExecutor;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utillities.TestBase;

import java.io.File;
import java.security.Key;

public class C04_TümSayfaScreenShot extends TestBase {
    @Test
    public void test01(){
        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //Nutella icin Arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //Sonuclarin Nutella Icerdigini Test Edin
        String actualSonucYazisi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();

        String expectedIcerik="Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        //ve rapora eklenmek icin tüm sayfanin fotografini cekin

        //Tüm sayfayi screenShot icin
        //1-TakeScreenshot objesi olustur
        TakesScreenshot ts=(TakesScreenshot) driver;
        // 2 - screenshot i kaydedecegimiz bir dosya olusturalim
        java.io.File tümSayfScreenshot=new File("target/screenshot.png");

        // 3 -Gecici bir dosya bir ts objesi ile cekilen fotogragi dosyaya kaydediyoruz






    }
}
