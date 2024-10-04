package lotr;

public class Knight extends Noble {

    public Knight() {
        super(5, 15, 5, 15);
    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
