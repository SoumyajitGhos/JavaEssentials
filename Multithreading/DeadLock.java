package Multithreading;

public class DeadLock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        System.out.println("Main is Starting");

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2");
                }
            }
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2...");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {  // This might be the duplicate 'e'
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock1");
                }
            }
        }, "thread2");

        thread1.start();
        thread2.start();

        System.out.println("Main is Ending");
    }
}