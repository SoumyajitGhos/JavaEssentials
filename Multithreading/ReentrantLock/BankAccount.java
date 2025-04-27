package Multithreading.ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    /* Having issue of infinite time taking and waiting of other threads
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdraw");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
    */

    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if(balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdraw");
                        Thread.sleep(10000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquitre the lock, will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
