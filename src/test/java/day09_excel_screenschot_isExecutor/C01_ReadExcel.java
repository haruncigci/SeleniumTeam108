package day09_excel_screenschot_isExecutor;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void test01() throws IOException {
    /*
    Biz kodlarimizla bilgisayardaki bir dosyaya direk erisim saglayip
    anlik o dosyadan bilgi almayiz

    Bunun yerine kod ortamimizda bilgisayarimizda ki excel dosyanin bir kopyasini
    olusturur
    2- excel deki tüm bilgileri kopya workbook a yükler
    3- workbook üzerinde yapacagimiz tüm islemleri yapariz
    4- eger olusturdugumuz workbook da update yaparsak
        son halini excel e islemek icin
        classin sonunda kopya workbookdaki bilgileri excel e kaydederiz

     */

      //1 - Bilgisayardaki excell e ulasmak icin dosya yolu gerekir

      String DosyaYolu="src/test/java/day09_excel_screenschot_isExecutor/ulkeler.xlsx";

      //2 - Dosya Yolu olusturdugumuz excelden bilgileri almaak icin
        // FileInputStream objesi olusturmaliyiz

        FileInputStream fis=new FileInputStream(DosyaYolu);
      //3 - Bilgilerini aldigimiz excel de calisma yapabilmek icin
        // kod ortamimizda kopya bir workbook olusturmaliyiz
        Workbook workbook= WorkbookFactory.create(fis);

        // Bilgisayarinizdaki Excell in icinde bulunan bütün bilgiler
        // artik workbook objesinde kayitli
        // excell in yapisi geregi sirayla
        // - istenen sayfa
        // - istenen satir
        // - istenen hücre
        // olusturulmalidir / okunmalidir

        //12.satirin , 3.hücresinin "Azerbaycan" oldugunu bulun
        Sheet sayfa1=workbook.getSheet("Sayfa1");
        // Excell index kullanir. Bu yüzden 0'dan Baslar
        Row row= sayfa1.getRow(11);
        Cell cell=row.getCell(2);

        String expectedData="Azerbaycan";
        String actualData=cell.toString();

        Assert.assertEquals(expectedData,actualData);














}
}
