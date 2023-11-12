package berzhanov.javarush.island.models.animals.herbivore;

import berzhanov.javarush.island.models.animals.Herbivore;

/**
 * Кролик
 */

public class Rabbit extends Herbivore {
    public Rabbit(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        super(weightKg, locationMaxCount, locationStepCount, toBeFullKg);
    }

}
