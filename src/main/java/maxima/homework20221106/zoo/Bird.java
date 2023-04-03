package src.main.java.maxima.homework20221106.zoo;

public class Bird extends Creature {

    public Bird(String skill) {
        super(skill);
    }

    @Override
    public String breath() {
        return "breathes using its beak";
    }

    @Override
    public String move() {
        return "Flying";
    }
}
