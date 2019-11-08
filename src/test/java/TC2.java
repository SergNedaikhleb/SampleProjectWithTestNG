import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("this will execute before the Class");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("this will execute after the Class");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("this will execute before every method");
    }

    @AfterMethod
    void afterMethod()
    {
        System.out.println("this will execute After every method");
    }

    @Test
    void test3()
    { System.out.println("this is test3..."); }

    @Test
    void test4()
    { System.out.println("this is test4..."); }

    @BeforeSuite
    void beforeSuite()
    { System.out.println("This will execute before the Test Suite"); }

    @AfterSuite
    void afterSuite()
    { System.out.println("This will execute after the Test Suite"); }
}
