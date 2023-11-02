package berzhanov.javarush.island.models.animals.herbivore;

import berzhanov.javarush.island.models.animals.Animal;
import berzhanov.javarush.island.models.animals.Herbivore;

/**
 * Кролик
 */

public class Rabbit extends Herbivore {
    public Rabbit(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        super(weightKg, locationMaxCount, locationStepCount, toBeFullKg);
    }

    @Override
    public void eat(Animal animal) {

    }

    @Override
    public void walk() {

    }

    @Override
    public void reproduce() {

    }
}
