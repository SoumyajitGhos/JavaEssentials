import java.util.LinkedList;
import java.util.ListIterator;

public class AboutLinkedList {
    public static void main(String []args) {
        /* All the methods that are present in ArrayList will mostly be present in LinkedList since they both implements a List and all those methods are of List */
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(3);

        /* ListIterator in action */
        ListIterator<Integer> iterator = ll.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
