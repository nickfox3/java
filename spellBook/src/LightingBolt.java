public class LightingBolt implements Spell {

    @Override
    public void cast() {
        System.out.println("Casting lighting bolt of Zeus");
    }

    @Override
    public String getIncantation() {
        return "Shazam";
    }

    @Override
    public String getHelp() {
        return "Summons lighting bolt from the gods";
    }
}
