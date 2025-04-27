package Multithreading.Volatile;

public class SharedData {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) {
            System.out.println("Processing...");
        }
        System.out.println("Thread stopped");
    }
}
