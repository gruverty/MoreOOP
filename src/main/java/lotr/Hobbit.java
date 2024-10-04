package lotr;

public class Hobbit extends Character {
    
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character opponent) {
        toCry();
    }

    public void toCry() {
        System.out.println("Hobbit cries.");
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
