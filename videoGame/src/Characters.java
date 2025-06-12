public abstract class Characters {
    public String name;
    public int health;
    public String attackPower;

    public Characters(String name, int health, String attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void attack();

    public String getName() {
        return name;
    }
}
