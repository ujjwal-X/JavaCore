package basic;

public class ThreadLimitTest {
    public static void main(String[] args) {
        int threadCount = 0;

        try {
            while (true) {
                Thread t = new Thread(() -> {
                    try {
                        Thread.sleep(Long.MAX_VALUE); // Keep the thread alive
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });

                t.start();
                threadCount++;
                System.out.println("Thread " + threadCount + " created");
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            System.err.println("Maximum threads reached: " + threadCount);
            e.printStackTrace();
        }
    }
}
