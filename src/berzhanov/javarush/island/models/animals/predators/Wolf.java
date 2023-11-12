package berzhanov.javarush.island.models.animals.predators;

import berzhanov.javarush.island.models.animals.Predator;

/**
 * Волк
 */

public class Wolf extends Predator {

    public Wolf(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        super(weightKg, locationMaxCount, locationStepCount, toBeFullKg);
    }

}
