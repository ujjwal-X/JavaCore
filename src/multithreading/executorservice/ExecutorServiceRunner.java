package multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Tasks());
        executorService.execute(new Thread(new Tasks()));
    }
}
