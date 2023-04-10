package maxima.homework20221106.zoo;

public class Bird extends Creature {

    public Bird(String type, String name, String skill) {
        super(type, name, skill);
    }

    @Override
    public String breath() {
        return "breathes using its beak";
    }

    @Override
    public String move() {
        return "Flying";
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}
