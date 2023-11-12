package berzhanov.javarush.island;

import berzhanov.javarush.island.models.Island;
import berzhanov.javarush.island.models.Location;
import berzhanov.javarush.island.models.animals.Animal;
import berzhanov.javarush.island.models.animals.Herbivore;
import berzhanov.javarush.island.models.animals.Plant;
import berzhanov.javarush.island.models.animals.Predator;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;


@AllArgsConstructor
public class LifeStep implements Runnable {

    private Island island;

    @Override
    public void run() {

        List<Location> locations = island.getLocationMap().values().stream().toList();
        //Animal animal = locations.get(0).getAnimals().get(0);
        Predator predator = null;
        Herbivore herbivore = null;

        System.out.println("Шаг в жизни Острова. Статистика:");
        for (Location location : locations) {
            for (Animal animal : location.getAnimals()){
                if(animal instanceof Predator){
                    predator = (Predator) animal;
                }
                if(animal instanceof Herbivore){
                    herbivore = (Herbivore) animal;
                }
            }
        }

        if (predator != null || herbivore != null) {
            predator.eat(herbivore);
        }

        for (Map.Entry<String, Location> location : island.getLocationMap().entrySet()) {
            System.out.println("Локация: " + location.getKey());
            for (Animal animal : location.getValue().getAnimals()){
                System.out.println(animal.getClass() + (animal.getIsDied() ?  ". Умер." : ". Живой." )
                        + "Вес: " + animal.getWeightKg());
            }
            for (Plant plant : location.getValue().getPlants()){
                System.out.println("Растение: " + plant.getClass());
            }
        }

        System.out.println();
    }


}
