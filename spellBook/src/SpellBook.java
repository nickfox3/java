import java.util.ArrayList;

public class SpellBook {
    private ArrayList<Spell> spells = new ArrayList<>();

    public SpellBook() {
        spells.add(new HealingLight());
        spells.add(new FireBall());
        spells.add(new IceSpike());
        spells.add(new LightingBolt());
        spells.add(new ExitSpell());
    }

    public void help() {
        System.out.println("\nIncantation\t| Description");
        System.out.println("----------------|-------------------------------");
        for (Spell spell : spells) {
            System.out.printf("%-15s| %s%n", spell.getIncantation(), spell.getHelp());
        }
    }

    // Checks and casts the spell based on input
    public void tryIncantation(String incantation) {
        boolean found = false;
        for (Spell s : spells) {
            if (s.getIncantation().equalsIgnoreCase(incantation)) {
                s.cast();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The spell fizzled out! Try again.");
        }
    }
}

