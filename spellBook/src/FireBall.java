public class FireBall implements Spell {

    @Override
    public void cast() {
        System.out.println("Casting Fire Ball of Doom");
    }

    @Override
    public String getIncantation() {
        return "Abracadabra";
    }

    @Override
    public String getHelp() {
        return "Hurls fireball from hell";
    }
}
