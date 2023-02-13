package day01_seleniumgiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // gittiginiz sayfadaki title ve url i yazdirin
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Baslik: " + driver.getTitle());
        // amazon anasayfaya gittiginizi test edin
        // Test expected result ile actual result in karsilastirmasidir
        //ornegin url amazon iceriyorsa diyebiliriz

        String expectedIcerik="amazon";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Test PAssed");
        }else {//gidemediysek
            System.out.println("Failed");
        }
    }
}
