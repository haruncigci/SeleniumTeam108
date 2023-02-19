package day04_JUnitFramework;

import org.junit.*;

public class C05_BirlikteKullanim {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class Calisti \n ==================");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("==================\nAfter Class Calisti");
    }
    @Before
    public void before(){
        System.out.println("\nBefor Methodu Calisti");

    }
    @After
    public void after(){
        System.out.println("After Methodu Calisti");
    }
    @Test
    public void test01(){
        System.out.println("Test01 Calisti");
    }
    @Test
    public void test02(){
        System.out.println("Test02 Calisti");
    }
    @Test
    public void test03(){
        System.out.println("Test03 Calisti");
    }
}
