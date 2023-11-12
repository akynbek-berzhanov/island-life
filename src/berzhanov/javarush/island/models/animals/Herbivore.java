package berzhanov.javarush.island.models.animals;

/**
 * Травоядное
 */

public abstract class Herbivore extends Animal {

    public Herbivore(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
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
