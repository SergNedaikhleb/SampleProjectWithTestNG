import org.testng.annotations.*;

public class DataProviderExample {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass=CustomDataProvider.class)
    public void loginTest(String email, String pwd)
    {
        System.out.println(email+ "  "+pwd);
    }

}
