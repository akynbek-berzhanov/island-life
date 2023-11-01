package berzhanov.javarush.island.models.animals;

/**
 * Животное. Главный класс
 */

public abstract class Animal {

    private Boolean isDied = false;

    //есть растения и/или других животных (если в их локации есть подходящая еда)
    public abstract void eat();

    //передвигаться (в соседние локации)
    public abstract void walk();

    //размножаться (при наличии пары в их локации)
    public abstract void reproduce();

    //умирать от голода или быть съеденными
    public void die() {
        this.isDied = true;
    }

}
