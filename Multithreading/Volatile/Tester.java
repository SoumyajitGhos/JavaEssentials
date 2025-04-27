package Multithreading.Volatile;

public class Tester {
    public static void main(String[] args) throws InterruptedException {

        /* Example of Volatility */
        // SharedData data = new SharedData();
        // new Thread("Thread1").start();
        
        // Thread.sleep(1000); // Let the thread run for a second
        // data.stop();    // Stop the thread

         /* Example where Volatility fails */
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
