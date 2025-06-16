public class HealingLight implements Spell {

    @Override
    public void cast() {
        System.out.println("Casting Healing Light of Athena");
    }

    @Override
    public String getIncantation() {
        return "Hocus Pocus";
    }

    @Override
    public String getHelp() {
        return "Shines a light healing all allies";
    }
}
