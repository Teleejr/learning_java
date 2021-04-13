package src.Game;

public class Hero {

    private int level;
    private int experience;
    private String name;
    //private int expNeeded;
    //private int hp;

    public Hero(String n) {
        name = n;
        level = 1;
        experience = 0;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setLevel(int lvl) {
        level = lvl;
    }

    public void setExp(int exp) {
        experience = exp;
    }

    public String showHero() {
        return String.format("Name: %2s Level: %2d Exp gained: %4d", getName(), getLevel(), getExp());
    }

    //Next methods: Normal attack(use Math.rand), Special attack(use Random class), Travel
}
