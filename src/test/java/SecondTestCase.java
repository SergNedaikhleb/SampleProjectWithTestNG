import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority=1)
    void setup() {
        System.out.println("Opening browser!");
    }

    @Test(priority=3)
    void searchCustomer() {
        System.out.println("Login test");
    }

    @Test(priority=2)
    void addCustomer() {
        System.out.println("Login test");
    }

    @Test(priority=4)
    void teardown() {
        System.out.println("Closing browser!");
    }
}
