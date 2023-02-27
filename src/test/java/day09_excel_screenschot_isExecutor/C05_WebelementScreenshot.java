package day09_excel_screenschot_isExecutor;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utillities.TestBase;

import java.io.File;

public class C05_WebelementScreenshot extends TestBase {
    @Test
    public void test(){
        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //Nutella icin Arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //Sonuclarin Nutella Icerdigini Test Edin
        String actualSonucYazisi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();

        String expectedIcerik="Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        //ve rapora eklenmek icin tsonuc yazisi elementinin fotografini cekin

        // 1 - fotograf cekilecek elementi locate edin
        // 2 - Dosyayi kaydetmek icin bir File olusturun
        File elementScreenshot = new File("/target/elementSreenshot.jpg");
    }
}
