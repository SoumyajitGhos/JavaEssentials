package Multithreading.Synchronization;

public class Stack {
    private int[] array;
    private int stackTop;
    private final Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean push(int element) {
        synchronized(lock) {
            if(isFull()) return false;
            ++ stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            array[stackTop] = element;
            return true;
        }
    }

    public int pop() {
        synchronized(this) {
            if(isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            stackTop --;
            return obj;
        }
    }

    public synchronized boolean push1(int element) {
        if(isFull()) return false;
        ++ stackTop;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        array[stackTop] = element;
        return true;
    }
    
    public synchronized int pop1() {
        if(isEmpty()) return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        stackTop --;
        return obj;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }
}
