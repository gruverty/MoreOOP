package lotr;

public class Character {
    public int power;
    public int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = Math.max(0, hp);
    }

    public Character() {
    }

    public void kick(Character opponent) {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
