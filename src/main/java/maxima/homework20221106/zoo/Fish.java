package src.main.java.maxima.homework20221106.zoo;

public class Fish extends Creature{

    public Fish(String type, String name, String skill) {
        super(type, name, skill);
    }

    @Override
    public String breath() {
        return "breathes using gills";
    }

    @Override
    public String move() {
        return "Swimming";
    }

    public void swim() {
        System.out.println("Fish is swimming");
    }
}
