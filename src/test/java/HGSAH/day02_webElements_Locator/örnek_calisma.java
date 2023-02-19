package HGSAH.day02_webElements_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class örnek_calisma {
    public static void main(String[] args) throws InterruptedException {

        //Amazon sayfasina git
        //arama tusuna tikla
        //iphone 14 arattir
        //ilk cikan satisi tikla


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Iphone 14 pro max" + Keys.ENTER);
        Thread.sleep(3000);




        driver.close();



    }
}
