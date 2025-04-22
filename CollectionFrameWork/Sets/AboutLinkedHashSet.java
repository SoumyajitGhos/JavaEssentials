package Sets;
import java.util.LinkedHashSet;
import java.util.Set;

public class AboutLinkedHashSet {
    public static void main(String args[]) {
        /* Its just the extension of set, its has all the same functionality
         * on top of it maintains the insertion order with help of LinkedList
         */

         Set<Integer> set = new LinkedHashSet<>();
         set.add(2);
         set.add(5);
         set.add(3);
         set.add(6);
         set.add(4);

         for(int x : set) {
            System.out.println(x);
         }
    }
}
