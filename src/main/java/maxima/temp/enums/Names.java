package src.main.java.maxima.temp.enums;

public enum Names {

    ROMAN(1, "roman"),
    ALEKSEI(2, "aleksei"),
    GRISHA(3, "grisha");

    private int id;
    private String nameInSmall;

    Names(int id, String nameInSmall) {
        this.id = id;
        this.nameInSmall = nameInSmall;
    }

    public int getId() {
        return id;
    }

    public String getNameInSmall() {
        return nameInSmall;
    }
}
