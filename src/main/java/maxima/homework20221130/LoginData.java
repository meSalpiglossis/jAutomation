package maxima.homework20221130;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

// DTO - Data Transfer Object
// POJO - Plain Old Java Object
public class LoginData {

    private static final Properties loginData;

    public static String login;
    public static String password;
    public static String phoneNumber;
    public static String verificationCode;

    static {
        System.out.println("LoginData: Loading Login Data from file...");
        loginData = new Properties();
//        InputStream is = LoginData.class.getResourceAsStream("/src/main/java/maxima/resources/creds.properties"); // doesn't work with Maven ?
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\maxima\\resources\\creds.properties");
            loginData.load(fileInputStream);
            fileInputStream.close();
//            loginData.load(is);
//            is.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        login = loginData.getProperty("username");
        password = loginData.getProperty("password");
        phoneNumber = loginData.getProperty("phone_number");
        verificationCode = loginData.getProperty("verification_code");
    }

    public static String getLogin() {
        System.out.println("LoginData.getLogin = " + login);
        return login;
    }

    public static String getPassword() {
        System.out.println("LoginData.getPassword = " + password);
        return password;
    }

    public static String getPhoneNumber() {
        System.out.println("LoginData.getPhoneNumber = " + phoneNumber);
        return phoneNumber;
    }

    public static String getVerificationCode() {
        System.out.println("LoginData.getVerificationCode = " + verificationCode);
        return verificationCode;
    }
}
