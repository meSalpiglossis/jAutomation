package src.main.java.maxima.homework20221102;

public class Document {

    public Document(){
        name = "Document default name";
    }

    @Override
    public String toString() {
        return (super.toString() + " " + name);
    }

    /*
    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return true;
    }
     */

    private String name;
}
