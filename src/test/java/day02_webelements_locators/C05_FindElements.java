package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazon sayfasin gidin
        driver.get("https://www.amazon.com");
         // arama kutusuna java yazdirin aratin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Java" + Keys.ENTER);  // submit yerine de kullanilabilir
        //aramaKutusu.submit();
        // arama sonuclarinda cikan resimlerdei yazilari yazdirin
        List<WebElement>aramasonuclariElementList=driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramasonuclariElementList); // 86

        // Bu 86 elementi yazdiralim
        int elementNo=1;
        for (WebElement eachElement:aramasonuclariElementList
             ) {
            System.out.println(elementNo + "----" + eachElement.getText());
            elementNo++;
        }
        Thread.sleep(3000);
        driver.close();
    }
}
