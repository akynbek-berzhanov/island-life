package berzhanov.javarush.island;

import berzhanov.javarush.island.models.Island;
import lombok.AllArgsConstructor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class Life {

    private Island island;

    void doLife(){

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new LifeStep(this.island), 0, 5, TimeUnit.SECONDS);
    }



}
