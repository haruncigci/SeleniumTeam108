package practice.NevzatHocaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverMethods {
    WebDriver driver;
    String https="https:www.";
    @Before
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // implicitlyWait(Duration.ofSeconds(15));  Interwiewda sorulan bir soru
        //15 saniye icerisinde yaptigim islemler yap, yapamazsan geri gel demek
        //her test icin en fazla 15 saniye bekle
    }
    @Test public  void test01() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.get(https+"google.com");
        //driver.findElement(By.xpath(""));

        driver.getTitle(); // sayfanin üstünde yazilan baslik.Tab in üstünde yaazar.
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to(https+"amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
         // Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println(driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(https+"facebook.com");
        System.out.println(driver.getWindowHandles());
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(5000);
    }
    @After public void teardown(){
        driver.close(); // acilan en son sayfayi browser i kapatir
        driver.quit(); // acilan bütün pencereleri kapatir
    }
    }
