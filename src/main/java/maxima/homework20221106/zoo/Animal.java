package maxima.homework20221106.zoo;

public class Animal extends Creature {

    public Animal(String type, String name, String skill) {
        super(type, name, skill);
    }

    @Override
    public String breath() {
        return "breathe through the nose";
    }

    @Override
    public String move() {
        return "Running";
    }

    public void jump() {
        System.out.println("Animal is jumping");
    }
}
