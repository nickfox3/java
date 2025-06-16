package com.example;

public class FireBall implements Spells {

    @Override
    public void cast() {
        System.out.println("Casting fireball of Doom");
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
