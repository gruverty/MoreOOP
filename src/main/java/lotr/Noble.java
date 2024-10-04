package lotr;

import java.util.Random;

public class Noble extends Character {

    private final Random rand = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        this.power = generateRandomValue(minPower, maxPower);
        this.hp = generateRandomValue(minHp, maxHp);
    }

    private int generateRandomValue(int min, int max) {
        return min + rand.nextInt(max - min + 1);
    }

    @Override
    public void kick(Character opponent) {
        int damage = rand.nextInt(this.power + 1);
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(getClass().getSimpleName() + " deals " + damage + " damage to the opponent.");
    }
}
