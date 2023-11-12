package berzhanov.javarush.island.models.animals;

/**
 * Хищник
 */

public abstract class Predator extends Animal {

    public Predator(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        super(weightKg, locationMaxCount, locationStepCount, toBeFullKg);
    }

    @Override
    public void eat(Animal animal) {
        this.setWeightKg(this.getWeightKg() + animal.getWeightKg());
        if (this.getWeightKg() >= this.getToBeFullKg())
            this.setIsFull(true);
        animal.die();
    }

    @Override
    public void walk() {

    }

    @Override
    public void reproduce() {

    }


}
