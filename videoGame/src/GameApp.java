import java.util.ArrayList;

public class GameApp {
    public static void main(String[] args) {
        // list of characters
        ArrayList<Characters> characterList = new ArrayList<>();

        // add different types
        characterList.add(new Warrior("Wonder Woman", 120, "shield bash"));
        characterList.add(new Mage("Dr. Fate", 190, "lighting strike"));
        characterList.add(new Archer("Green Arrow", 50, "piercing arrow"));

        // loop
        System.out.println("\n === Battle begins ===");
        for (Characters c : characterList) {
            System.out.print(c.getName() + " attacks: ");
            c.attack();
        }
    }


}
