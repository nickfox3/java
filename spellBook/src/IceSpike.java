public class IceSpike implements Spell {

    @Override
    public void cast() {
        System.out.println("Casting Ice Avalanche");
    }

    @Override
    public String getIncantation() {
        return "Alakazam";
    }

    @Override
    public String getHelp() {
        return "Throws Ice Avalanche with fury";
    }
}
