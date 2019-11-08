import org.testng.annotations.*;


public class TC1 {

    @BeforeClass
    void beforeClass() {
        System.out.println("this will execute before the Class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("this will execute after the Class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("this will execute before every method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("this will execute After every method");
    }

    @Test
    void test1() {
        System.out.println("this is test1...");
    }

    @Test
    void test2() {
        System.out.println("this is test2...");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("This will execute before the TEST");
    }

    @AfterTest
    void afterTest() {
        System.out.println("This will execute after the TEST");
    }
}