package day01_seleniumgiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        /*
        jar dosyalarini yükleyerek Seleniumu kullanilir hale getirdik
        Ancak herbir classin hangi browser ile calismasini istiyorsak o browser ile ilgili
        driveri class da tanimlamamiz lazim
        Browser ile ilgili tercihimiz dogrultusunde ilgili ayarlari yapmak icin
        Java daki System classindan
        setProperty() kullanilir

        methoda 2 parametre ekleyecegiz
        1 parametre herkes icin ayni :
        2 parametre bu driverin dosya yolu
        herkesin bilgisayarinda farkli olabilir
        windows bilgisayarinda sonunda .exe olmalidir
         */

        System.setProperty("webdriver.com.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // istenen sayfaya gitmek icin
        driver.get("https://www.wisequarter.com"); //https: olmak zorunda
        Thread.sleep(3000); // bekleme süresi
        driver.close(); // sayfayi kapatiriz


    }
}
