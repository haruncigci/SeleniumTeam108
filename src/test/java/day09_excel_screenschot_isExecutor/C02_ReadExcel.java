package day09_excel_screenschot_isExecutor;

import com.github.javafaker.File;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class C02_ReadExcel {
    @Test
    public void test01() throws IOException {

        // 1.satirdaki 2.hucreye gidelim ve yazdiralim
        String dosyayolu="src/test/java/day09_excel_screenschot_isExecutor/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyayolu);
        Workbook workbook= WorkbookFactory.create(fis);
        // - 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String IstenenData=workbook.getSheet("Sayfa1")
                .getRow(8)
                .getCell(1)
                .toString();
        System.out.println("Istenen Data : " + IstenenData);
        // - 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String expectedData="Kabil";
        String actualData=workbook
                .getSheet("Sayfa1")
                .getRow(1)
                .getCell(3)
                .toString();
        Assert.assertEquals(expectedData,actualData);
        // - Satir sayisini bulalim
        // getLastRowNum() son satirin index ini verir
        System.out.println("Satir Sayisi : " + (workbook.getSheet("Sayfa2").getPhysicalNumberOfRows()));

        // - sayfa2 deki  Satir sayisini bulalim ve  Fiziki olarak kullanilan satir sayisini bulun
        System.out.println("Sayfa2 satir Sayisi: "+ (workbook.getSheet("Sayfa2").getLastRowNum()+ 1));
        System.out.println("Sayfa2 fiziki kullanilan satir sayisi : " +
                workbook.getSheet("Sayfa2").getPhysicalNumberOfRows());
        // - Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
        Map<String,String > ülkelerMAp=new TreeMap<>();

        int LastIndex=workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i <=LastIndex ; i++) { //basligi almamak icin 1 den basladik
            String ülkeler=workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String baskent=workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();

            ülkelerMAp.put(ülkeler,baskent);
        }
        System.out.println(ülkelerMAp);



    }
}
