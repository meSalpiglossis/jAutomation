package src.main.java.maxima.homework20221106.zoo;

public class Animal extends Creature {

    public Animal(String skill) {
        super(skill);
    }

    @Override
    public String breath() {
        return "breathe through the nose";
    }

    @Override
    public String move() {
        return "Running";
    }
}
