package Queues;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class AboutQueue {
    public static void main(String []args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());

        /* For double ended queue we will be using  ArrayDeque since it is more beneficial and less time comsuming
         * as the elements can enter from any side front or last
        */
        Deque<Integer> dq = new ArrayDeque<>();

        /* In the below example the deque is behaving as a stack we can do that but it is not recommendable */
        dq.offerFirst(8);
        dq.offerFirst(9);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);

        /* Below example is behaving as a Deque, here the combination of inserting element and taking out element makes the all */
        dq.offerLast(8);
        dq.offerLast(9);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
    }
}
