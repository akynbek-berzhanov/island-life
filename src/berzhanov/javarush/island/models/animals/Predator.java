package berzhanov.javarush.island.models.animals;

/**
 * Хищник
 */

public abstract class Predator extends Animal {

    public Predator(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        super(weightKg, locationMaxCount, locationStepCount, toBeFullKg);
    }
}
