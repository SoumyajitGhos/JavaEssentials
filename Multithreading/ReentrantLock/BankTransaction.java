package Multithreading.ReentrantLock;

public class BankTransaction {
    public static void main(String args[]) {
        final BankAccount SBIAccount = new BankAccount();

        /* Anonymous implementation of Runnable  */
        Runnable task = new Runnable() {
            @Override
            public void run() {
                SBIAccount.withdraw(50);
            }
        };

        new Thread(task, "Thread1").start();
        new Thread(task, "Thread2").start();
    }
}
