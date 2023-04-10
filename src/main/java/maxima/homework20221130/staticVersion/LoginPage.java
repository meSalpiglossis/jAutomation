package src.main.java.maxima.homework20221130.staticVersion;

public class LoginPage extends BasePage {

    public void login(LoginData ld) {
        enterLogin(ld.getLogin());
        enterPassword(ld.getPassword());
        enterPhoneNumber(ld.getPhoneNumber());
        enterVerificationCode(ld.getVerificationCode());

        clickSubmitButton();
    }

    private void enterLogin(String login) {
        //TODO: do something with login_edit_box - вызовы Selenium, а затем Selenide
        System.out.printf("LoginPage.enterLogin(%s)... ", login);
        login_edit_box.enterText(login);
    }

    private void enterPassword(String password) {
        //TODO: do something with password_edit_box - вызовы Selenium, а затем Selenide
        System.out.printf("LoginPage.enterPassword(%s)... ", password);
        password_edit_box.enterText(password);
    }


    private void enterPhoneNumber(String phoneNumber) {
        //TODO: do something with phoneNumber_edit_box - вызовы Selenium, а затем Selenide
        System.out.printf("LoginPage.enterPhoneNumber(%s)... ", phoneNumber);
        phoneNumber_edit_box.enterText(phoneNumber);
    }

    private void enterVerificationCode(String verificationCode) {
        //TODO: do something with verificationCode_edit_box - вызовы Selenium, а затем Selenide
        System.out.printf("LoginPage.enterVerificationCode(%s)... ", verificationCode);
        verificationCode_edit_box.enterText(verificationCode);
    }

    private void clickSubmitButton() {
        //TODO: do something with submit_button - вызовы Selenium, а затем Selenide
        System.out.println("LoginPage.clickSubmitButton");
        submit_button.click();
    }

    private WebElement login_edit_box = new WebElement("Login Edit Box locator");
    private WebElement password_edit_box = new WebElement("Password Edit Box locator");
    private WebElement phoneNumber_edit_box = new WebElement("Phone Number Edit Box locator");
    private WebElement verificationCode_edit_box = new WebElement("Verification Code Edit Box locator");
    private WebElement submit_button = new WebElement("Submit Button locator");

}
