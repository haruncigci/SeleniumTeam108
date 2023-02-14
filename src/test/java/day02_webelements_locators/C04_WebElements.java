package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina Gidin
        driver.get("https://www.amazon.com");
        // arama kutusunu Locate edip bir webelement olarak kaydedin
        // id si twotabsearchtextbox webelement seklinde locate edecegiz
        /*
        drivera webelementi tarif etme islemine Locate,
        Bu tarifi yapabilmek icin kullanabilecegim degiskenlere de locator denir.

        8 Tane locator vardir
        Locatorlarin 6 tanesi webelementin ozelliklerine baglidir
            - id
            - classname
            -name
            -tagname
            -linktext
            -partiellinktext
        Geriye kalan 2 locator ise hertürlü webelementi locate etmek icin kullanilir
            -xpath
            -cssSelector

         */
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusuna nutella yazip aratin
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit(); // element uzerinde enter yapmis oluyoruz

        Thread.sleep(3000);
    }
}
