package berzhanov.javarush.island.models;

import berzhanov.javarush.island.models.animals.*;
import berzhanov.javarush.island.models.animals.herbivore.*;
import berzhanov.javarush.island.models.animals.predators.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Location {
    List<Animal> animals;
    List<Plant> plants;

    public Location() {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    public Location createAnimals(){
        int count = 1;
        for (int i = 0; i < count; i++) {
            animals.add(new Wolf(50.0, 30, 3, 8.0));
            animals.add(new Rabbit(2.0, 150, 2, 0.45));
        }
        return this;
    }

    public Location createPlants(){
        int count = 1;
        for (int i = 0; i < count; i++) {
            plants.add(new Plant());
        }
        return this;
    }

}
