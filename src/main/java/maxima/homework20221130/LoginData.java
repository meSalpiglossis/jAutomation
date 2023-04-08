package src.main.java.maxima.homework20221130;

import org.xml.sax.Locator;

import java.io.FileInputStream;
import java.util.Properties;

// DTO - Data Transfer Object
// POJO - Plain Old Java Object
public class LoginData {

    private static final Properties loginData;

    public static String login;
    public static String password;

    static {
        System.out.println("LoginData: Loading Login Data from file...");
        loginData = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\resources\\creds.properties");
            loginData.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        login = loginData.getProperty("username");
        password = loginData.getProperty("password");
    }

    public static String getLogin() {
        System.out.println("LoginData.getLogin = " + login);
        return login;
    }

    public static String getPassword() {
        System.out.println("LoginData.getPassword = " + password);
        return password;
    }
}
