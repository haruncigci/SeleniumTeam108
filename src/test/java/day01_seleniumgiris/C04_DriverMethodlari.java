package day01_seleniumgiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");
        driver.close();
        System.out.println(driver.getWindowHandle());
        // getWindowHandle selenium tarafindan her driver sayfasi icin
        // üretilen unique handle degerini döndürür
        // getWindowhandels() ise test sirasinda birden fazla sayfa acilmissa
        // bir set olarak tüm sayfalarin windowhandel degerlerini döndürür

        System.out.println(driver.getPageSource());
        //sayfa kodlari "2 hours weekly meeting with the team" diorsa test edin

        String expectedIcerik="2 hours weekly meeting with the team";
        String actualSayfaKodlari= driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test Passt");
        }else System.out.println("Test Failed");

        driver.quit();
        // close() ve quit() ikiside sayfa kapatmak icin kullanilir
        // close() sadece bir sayfa kapatirken
        // quit() test sirasinda acilan tüm sayfalari kapatir
    }


}
