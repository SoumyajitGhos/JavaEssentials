package Multithreading.Volatile;

public class Counter {
    private volatile int count = 0;

    /* Not atomic!
    public void increment() {
        count++;
    }
    */

    /* Atomic */
    public synchronized void increment() {
        count++; 
    }

    public int getCount() {
        return count;
    }
}
