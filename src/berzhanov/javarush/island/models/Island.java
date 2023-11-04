package berzhanov.javarush.island.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Остров
 */

@Data
public class Island {

    //ширина, количество клеток
    private final Integer width;

    //высота, количество клеток
    private final Integer height;

    //время шага жизни в секундах
    private final Integer lifeStepSecond;

    //количество каждого животного
    private final Integer startAnimalCount;

    private Map<String, Location> locationMap;

    public Island(Integer width, Integer height, Integer lifeStepSecond, Integer startAnimalCount) {
        this.width = width;
        this.height = height;
        this.lifeStepSecond = lifeStepSecond;
        this.startAnimalCount = startAnimalCount;
        locationMap = new HashMap<>();

        /*for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                Location location = new Location();
                List<Animal> animals = new ArrayList<>();
                List<Plant> plants = new ArrayList<>();
                animals.add(new Wolf(50.0, 30, 3, 8.0));
                animals.add(new Rabbit(2.0, 150, 2, 0.45));
                plants.add(new Plant());
                location.animals = animals;
                location.plants = plants;

                locationMap.put(i + "-" + i, location);
            }
        }*/
    }

    /**
     * добавление пустых локаций
     * @return this
     */
    public Island createLocations(){
        for (int i = 1; i < height+1; i++) {
            for (int j = 1; j < width+1; j++) {
                Location location = new Location();
                locationMap.put(i + "-" + j, location);
            }
        }
        return this;
    }


}
