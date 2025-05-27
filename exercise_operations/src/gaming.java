public class gaming {
    public static void main(String[] args) {
        int currentXP = 1200; // experience points
        int level = 5;
        int xpToNextLevel = 1500;
        boolean levelUp;

        // 1. completing a quest
        currentXP += 300;
        // reduce xpToNextLevel based on gained XP
        xpToNextLevel -= 300;
        // 2. double XP boost
        currentXP *= 2;
        // adjust xpToNextLevel again since currentXP jumped
        levelUp = currentXP >= 1500;

        // comparison operations
       boolean xpEnough = currentXP >= xpToNextLevel;
       boolean reachedMaxLevel = level >= 10;

       // logical operations
        levelUp = (xpEnough && level > 10);
        boolean isPro = (level > 7 || currentXP > 5000);

        System.out.println("Current XP: " + currentXP);
        System.out.println("XP to next level: " + xpToNextLevel);
        System.out.println("Level: " + level);
        System.out.println("XP Enough? " + xpEnough);
        System.out.println("Reached Max Level? " + reachedMaxLevel);
        System.out.println("Level Up? " + levelUp);
        System.out.println("Is Pro Player? " + isPro);

    }
}
