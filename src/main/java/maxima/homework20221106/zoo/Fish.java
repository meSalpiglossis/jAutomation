package src.main.java.maxima.homework20221106.zoo;

public class Fish extends Creature{

    public Fish(String skill) {
        super(skill);
    }

    @Override
    public String breath() {
        return "breathes using gills";
    }

    @Override
    public String move() {
        return "Swimming";
    }
}
