package com.example;

public class HealingLight implements Spells {
    @Override
    public void cast() {
        System.out.println("Casting Healing Light of Athena ");
    }

    @Override
    public String getIncantation() {
        return "Hocus Pocus";
    }

    @Override
    public String getHelp() {
        return "Shines a blinding light healing all allies";
    }
}
