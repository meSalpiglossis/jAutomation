package src.main.java.maxima.homework20221130;

public class LoginPage extends BasePage{

    public void login(LoginData ld) {
        //TODO: Impl me!
        enterLogin(ld.getLogin());
        enterPassword(ld.getPassword());
        clickSubmitButton();
    }

    private void enterLogin(String login) {
        //TODO: do something with login_edit_box - вызовы Selenium, а затем Selenide
        System.out.printf("LoginPage.enterLogin(%s)\n", login);
        login_edit_box.enterText(login);
    }

    private void enterPassword(String password) {
        //TODO: do something with password_edit_box - вызовы Selenium, а затем Selenide
        System.out.printf("LoginPage.enterPassword(%s)\n", password);
        password_edit_box.enterText(password);
    }

    private void clickSubmitButton() {
        //TODO: do something with submit_button - вызовы Selenium, а затем Selenide
        System.out.println("LoginPage.clickSubmitButton");
        submit_button.click();
    }

    private WebElement login_edit_box = new WebElement("Login Edit Box locator");
    private WebElement password_edit_box = new WebElement("Password Edit Box locator");
    private WebElement submit_button = new WebElement("Submit Button locator");

}
