package berzhanov.javarush.island.models.animals;

import lombok.Data;

/**
 * Животное. Главный класс
 */

@Data
public abstract class Animal {

    //Вес одного животного, кг
    private Double weightKg;

    //Максимальное количество животных этого вида на одной клетке
    private Integer locationMaxCount;

    //Скорость перемещения, не более чем, клеток за ход
    private Integer locationStepCount;

    //Сколько килограммов пищи нужно животному для полного насыщения
    private Double toBeFullKg;

    //Быть убитым, умереть
    private Boolean isDied;
    //Быть сытым
    private Boolean isFull;

    //есть растения и/или других животных (если в их локации есть подходящая еда)
    public abstract void eat(Animal animal);

    //передвигаться (в соседние локации)
    public abstract void walk();

    //размножаться (при наличии пары в их локации)
    public abstract void reproduce();

    //умирать от голода или быть съеденными
    public void die() {
        this.isDied = true;
    }

    public Animal(Double weightKg, Integer locationMaxCount, Integer locationStepCount, Double toBeFullKg) {
        this.weightKg = weightKg;
        this.locationMaxCount = locationMaxCount;
        this.locationStepCount = locationStepCount;
        this.toBeFullKg = toBeFullKg;
        this.isDied = false;
    }
}
