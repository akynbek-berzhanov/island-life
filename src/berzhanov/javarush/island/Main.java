package berzhanov.javarush.island;

import berzhanov.javarush.island.models.Island;

public class Main {
    public static void main(String[] args) {

        Island island = new Island( 5, 5, 2, 1);

        Life life = new Life(island);
        life.doLife();

    }
}