package lotr;

public class Elf extends Character {
    

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < this.getPower()) {
            opponent.setHp(0);
            System.out.println("Elf kills the opponent.");
        } else {
            opponent.setPower(opponent.getPower() - 1);
            System.out.println("Elf reduces opponent's power by 1.");
        }
    }

    @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
