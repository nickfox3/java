package com.example;

import java.util.ArrayList;

public class SpellBook {
    private ArrayList<Spells> spells = new ArrayList<>();

    public SpellBook() {
        spells.add(new HealingLight());
        spells.add(new LightingBolt());
        spells.add(new FireBall());
        spells.add(new IceSpike());
    }

    public void help() {
        System.out.println("\nIncantation\t | Description");
        System.out.println(" ----------------- | -------------------------");
        for (Spells spell : spells) {
            System.out.printf("%-15s| %s%n", spell.getIncantation(), spell.getHelp());
        }
    }

    public void tryIncantation(String incantation) {
        boolean found = false;
        for (Spells s : spells) {
            if (s.getIncantation().equalsIgnoreCase(incantation)) {
                s.cast();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The spell fizzled out! Try again");
        }
    }
}
