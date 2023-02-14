package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlar {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve


        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
        // sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        String expextedTitle="facebook";
        String actualTitle=driver.getTitle();
        if (expextedTitle.contains(actualTitle)){
            System.out.println("facebookTitle Testi Passt");
        }else System.out.println("FacebookTitle Testi Failed" + "\nGerceklesen Title : " + actualTitle);

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedIcerik="facebook";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Facebook Url Testi Passt");
        }else System.out.println("Facebook Url Testi Failed" +
                                    "\nGerceklesen Url : " + actualUrl);
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.wallmart.com");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String wallmartexpectedIcerik="Walmart.com";
        String walmartActualTitle=driver.getTitle();

        if (walmartActualTitle.contains(wallmartexpectedIcerik)){
            System.out.println("Walmart title Testi Passed");
        }else System.out.println("Walmart Title Testi Failed");
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().getSize();
        //9.Browser’i kapatin
        driver.close();
    }
}
