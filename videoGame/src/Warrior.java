public class Warrior extends Characters {
    private String weapon;

    public Warrior(String name, int health, String attackPower) {
        super(name, health, attackPower);
        this.weapon = "Sword and Shield of Ares";
    }

    @Override
    public void attack() {
        System.out.println("Warrior uses the " + weapon + " to unleash a devastating blow!");
    }

}

