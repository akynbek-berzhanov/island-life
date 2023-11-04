package berzhanov.javarush.island;

import berzhanov.javarush.island.models.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        * 1. пустой остров
        * 2. в остров добавить пустые локации, согласно размеру острова
        * 3. в локациях рандомом добавить животных
        * 4. в локациях рандомом добавить растение
        * */



        Island island = new Island( 2, 2, 2, 1);
        island.createLocations();
        for (Map.Entry<String, Location> location : island.getLocationMap().entrySet()) {
            location.setValue(location.getValue().createAnimals());
        }

        Life life = new Life(island);
        life.doLife();

    }
}