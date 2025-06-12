public class Mage extends Characters {
    private String spell;

    public Mage(String name, int health, String attackPower) {
        super(name, health, attackPower);
        this.spell = "Lightning Bolt of Zeus";
    }

    @Override
    public void attack() {
        System.out.println("Mage calls upon the " + spell + " to smite enemies with divine fury!");
    }

}

