package src.Game;

import src.Monster.FireMonster;

public class Runner {

    public static void main(String[] args) {

        Hero jahka = new Hero("Jahka");
        FireMonster monster = new FireMonster("Dragon");

        System.out.println(jahka.showHero());
        System.out.println(monster.attack());
    }
}
