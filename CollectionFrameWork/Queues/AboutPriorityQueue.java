package Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import ComparableAndComparator.MyCustomComparator;
import ComparableAndComparator.StudentMarks;

public class AboutPriorityQueue {
    public static void main(String []args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(2);
        pq.offer(100);
        pq.offer(1);
        pq.offer(8);
        
        List<Integer> bottom2 = new ArrayList<>();
        int index = 0;
        while(!pq.isEmpty()) {
            if(index == 2) break;
            bottom2.add(pq.poll());
            index++;
        }
        // System.out.println(bottom2);
        // System.out.println(pq);

        /* Get me the top 3 students according to their maths marks */
        List<StudentMarks> sMarks = new ArrayList<>();
        sMarks.add(new StudentMarks(70, 80));
        sMarks.add(new StudentMarks(38, 10));
        sMarks.add(new StudentMarks(100, 38));
        sMarks.add(new StudentMarks(40, 88));
        sMarks.add(new StudentMarks(97, 19));

        /* We want to add all the marks in the Priority Queue using the constructor while initialisation
         * Since it takes any collection as parameter, we can pass any of them
         */
        PriorityQueue<StudentMarks> spq = new PriorityQueue<>(sMarks);

        int kStudents = 0;
        List<StudentMarks> top3 = new ArrayList<>();
        while(!spq.isEmpty()) {
            if(kStudents == 3) break;
            top3.add(spq.poll());
            index++;
        }
        // System.out.println(top3);

        /*
         * Want to create a priority queue giving the students having lowesr maths marks
         * Do we need to change the StudentsMarks comparable ???
         * Will it be a good choice for wrapper class like Integer and all...
         * 
         * No, we shouldn't alter the implementation of the pre defined wrapper classes
         */

        PriorityQueue<StudentMarks> spq2 = new PriorityQueue<>(new MyCustomComparator());
        /* Or rather could use lamdas to do so */
        PriorityQueue<StudentMarks> spq3 = new PriorityQueue<>((a, b) -> b.getMaths() - a.getMaths());
        spq2.addAll(sMarks);

        kStudents = 0;
        List<StudentMarks> least3 = new ArrayList<>();
        while(!spq2.isEmpty()) {
            if(kStudents == 3) break;
            least3.add(spq2.poll());
            index++;
        }
        System.out.println(least3);
    }
}
