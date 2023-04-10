package src.main.java.maxima.homework20221130.staticVersion;

//Note that WebElement is Selenium entity
public class WebElement {
    private final String name;
    private String text;

    public WebElement(String locator) {
        System.out.println("Defined new WebElement: " + locator);
        name = locator;
    }

    public void enterText(String text) {
        this.text = text;
        System.out.println("Done.");
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void click() {
    }
}
