public class ExitSpell implements Spell {

    @Override
    public void cast() {
        System.out.println("Spell fizzes out adn you vanish into thin air");
        System.exit(0);
    }

    @Override
    public String getIncantation() {
        return "Exit";
    }

    @Override
    public String getHelp() {
        return "Opens a portal to another dimension";
    }
}
