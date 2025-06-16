package com.example;

public class LightingBolt implements Spells {
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
        return "Summons a lighting bolt from the gods";
    }
}
