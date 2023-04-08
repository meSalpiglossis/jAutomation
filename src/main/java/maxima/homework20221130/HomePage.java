package src.main.java.maxima.homework20221130;

public class HomePage extends BasePage{

    public boolean isImportantLabelAvaliable() {
        System.out.println("HomePage.isImportantLabelAvaliable = true");
        return true;
    }

    private WebElement important_label = new WebElement("Important Label locator");
}
