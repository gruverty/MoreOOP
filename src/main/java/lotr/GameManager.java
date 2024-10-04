package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("The fight begins between " + c1.getClass().getSimpleName() + " and "
                + c2.getClass().getSimpleName() + "!");

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName() + "!");
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " has been defeated.");
                break;
            }
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName() + "!");
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has been defeated.");
            }
        }
        if (!c1.isAlive() && !c2.isAlive()) {
            System.out.println("Both fighters have been defeated! It's a draw!");
        } else if (!c1.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " wins the fight!");
        } else {
            System.out.println(c1.getClass().getSimpleName() + " wins the fight!");
        }
    }
}
