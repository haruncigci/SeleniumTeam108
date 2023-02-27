package HGSAH.day02_webElements_Locator;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utillities.TestBase;

import java.util.List;

public class IframeSoru extends TestBase {


    @Test public void test01(){
        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.findElement(By.xpath("//*[text()='Alle akzeptieren']")).click();

        // 2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframeList=driver.findElements(By.tagName("iframe"));
        System.out.println(iframeList.size());
        // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@width=\"560\"]"));
        driver.switchTo().frame(iframeElement);

        WebElement playTusu=driver.findElement(By.xpath("//button[@class=\"ytp-large-play-button ytp-button ytp-large-play-button-red-bg\"]"));
        playTusu.click();

        // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().parentFrame();
        // 5) ikinci iframe'deki (Jmeter Made Easy) linke

        // (https://www.guru99.com/live-selenium-project.html) tıklayınız


    }

}
