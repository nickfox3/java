public class Archer extends Characters {
    private String bow;

    public Archer(String name, int health, String attackPower) {
        super(name, health, attackPower);
        this.bow = "Bow of Artemis";
    }

    @Override
    public void attack() {
        System.out.println("Archer fires a piercing arrow from the " + bow + " with deadly precision!");
    }

}
