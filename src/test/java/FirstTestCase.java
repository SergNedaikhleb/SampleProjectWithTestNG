import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority=1)
    void setup() {
        System.out.println("Opening browser!");
    }

    @Test(priority=2)
    void login() {
        System.out.println("Login test");
    }

    @Test(priority=3)
    void teardown() {
        System.out.println("Closing browser!");
    }
}
