package src.main.java.maxima.homework20221130;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{
    //TODO*: add 2 phase autentification for login fuctionality
    //LoginData add phoneNumber, verificationCode
    //TODO**: static method based version

    @Test
    public void loginTest() {
        //Arrange phase
        //TODO: Add reading data from file - done in LoginData.java
        //TODO***: Add xml serialization / deserealization for login data
        LoginData loginData = new LoginData();
        LoginPage loginPage = new LoginPage();
        //Action phase
        loginPage.login(loginData);
        //Assert phase
        HomePage homePage = new HomePage();
        Assert.assertTrue("Home Page wasn't loaded in proper way. ", homePage.isImportantLabelAvaliable());
    }
}
