import org.testng.annotations.*;

public class PriorityExample {

    @Test(priority=0)
    void TestOne()
    {
        System.out.println("This is TestOne");
    }

    @Test(priority=1)
    void TestTwo()
    {
        System.out.println("This is TestTwo");
    }

    @Test(priority=2)
    void TestThree()
    {
        System.out.println("This is TestThree");
    }

    @Test(priority=3, enabled=false)
    void TestFour()
    {
        System.out.println("This is TestFour");
    }
}
