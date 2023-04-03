package src.main.java.maxima.homework20221106.zoo;

public abstract class Creature {

    private String skill;

    protected Creature(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public abstract String breath();

    public abstract String move();
}
