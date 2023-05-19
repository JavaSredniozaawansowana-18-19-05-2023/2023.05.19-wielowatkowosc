package pl.szkolenia.comarch.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        /*ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());
        singleExecutor.submit(new Watek());

        singleExecutor.shutdown();*/

        /*ExecutorService singleExecutor2 = Executors.newSingleThreadExecutor();
        singleExecutor2.submit(new Watek());
        singleExecutor2.submit(new Watek());
        singleExecutor2.submit(new Watek());
        singleExecutor2.submit(new Watek());
        singleExecutor2.submit(new Watek());
        singleExecutor2.submit(new Watek());*/

        /*ExecutorService multiExecutor = Executors.newFixedThreadPool(4);
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());
        multiExecutor.submit(new Watek());

        multiExecutor.shutdown();*/

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(4);

        scheduledExecutorService.schedule(new Watek(), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Watek(), 7, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
