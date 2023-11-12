package berzhanov.javarush.island.models.animals.herbivore;

import berzhanov.javarush.island.models.animals.Herbivore;

/**
 * Овца
 */

public class Sheep extends Herbivore {
    public Sheep(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        super(weightKg, locationMaxCount, locationStepCount, toBeFullKg);
    }

}
