package Multithreading.Synchronization;

public abstract class Synchronization {
    public static void main(String args[]) {

        System.out.println("Main is starting");

        Stack stack = new Stack(5);

        new Thread(() -> {
            int counter = 0;
            while(++ counter < 10) System.out.println("Pushed: " + stack.push(100));
        }, "Pushar").start();

        new Thread(() -> {
            int counter = 0;
            while(++ counter < 10) System.out.println("Popper: " + stack.pop());
        }, "Popper").start();

        System.out.println("Main is ending");
    }
}
