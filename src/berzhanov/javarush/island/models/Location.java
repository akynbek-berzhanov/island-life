package berzhanov.javarush.island.models;

import berzhanov.javarush.island.models.animals.Animal;
import berzhanov.javarush.island.models.animals.Plant;
import lombok.Data;

import java.util.List;

@Data
public class Location {
    List<Animal> animals;
    List<Plant> plants;


}
