package Multithreading.Synchronization;

/* Now here since we are sponning of a thread from the main thread there are two threads that would be running 
 * i)  The main thread itself
 * ii) The thread1 that we just spond of from the main thread
 * For the main thread we created our own user thread so therefore this thread1
 * is the child thread of the main thread
 * 
 * Thre is no order in which they executed, it is on the mercy of JVM in which order it should 
 * execute the code and should not make any assumptions in which order code is being executed
*/
public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is starting");

        Thread thread1 = new Thread1("thread1");
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        /* Using Lamdas */
        Thread thread3 = new Thread(() ->
        {
            for(int i = 0; i < 5; i++) {
                System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
            }
        }, "thread3");

        System.out.println("Main is existing");
    }
}