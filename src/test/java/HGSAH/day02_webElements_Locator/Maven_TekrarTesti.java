package HGSAH.day02_webElements_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Maven_TekrarTesti {
    @Test
    public void Test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //"https://www.saucademo.com" Adresine Gidin
        driver.get("https://www.saucedemo.com");

        //Username kutusuna "standart_user" yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Login Tusuna Basin
        driver.findElement(By.id("login-button")).click();

        //Ilk Urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();

        //Add to Card butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //Alisveris Sepetine Tiklayin
        driver.findElement(By.id("shopping_cart_container")).click();
        //Sectiginiz Ürünün Basarili Bir Sekilde sepete Eklendigini Kontrol edin
        driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed();
        driver.close();

    }
}
