package maxima.homework20221106.zoo;

public abstract class Creature {

    private String type;
    private String name;
    private String skill;

    public Creature(String type, String name, String skill) {
        this.type = type;
        this.name = name;
        this.skill = skill;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    abstract public String breath();

    abstract public String move();

}
