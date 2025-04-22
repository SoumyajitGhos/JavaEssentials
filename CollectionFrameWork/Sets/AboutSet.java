package Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import ComparableAndComparator.StudentMarks;

public class AboutSet {
    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        /* HashSet is the implementation of Set class */
        Set<Integer> set = new HashSet<>(arr);
        Set<Integer> set2 = new HashSet<>(arr);

        /* Add elements to set */
        set.add(2);

        /* Remove elements from set */
        set.remove(2);

        /* Clearing the Set */
        set.clear();
        System.out.println(set);

        /* RetainAll method will give you the intersection of the two set
         * and would modify the set on which it is being applied
         */
        set.add(1);
        set2.add(6);
        set2.add(7);
        System.out.println(set);
        System.out.println(set2);

        set.retainAll(set2);
        // 1 will be removed from set but set2 will be unchanged
        System.out.println("After applying retainAll method"); 
        System.out.println(set);
        System.out.println(set2);

        /* RemoveAll methods give the set difference 
         * and would modify the set on which it is being applied
        */

        set.add(1);
        System.out.println(set);
        System.out.println(set2);

        set.removeAll(set2);
        // 1 will be present only in set but set2 will be unchanged
        System.out.println("After applying removeAll method"); 
        System.out.println(set);
        System.out.println(set2);

        /* addAll method give sthe union of the sets */
        set.addAll(set2);

        /* Methods to check if a perticular element is prersent or not */
        System.out.println(set.contains(1));

        /* Internal Working  of Hash */
        Set<StudentMarks> set3 = new HashSet<>();
        set3.add(new StudentMarks(70, 80));
        set3.add(new StudentMarks(38, 10));
        set3.add(new StudentMarks(100, 38));
        set3.add(new StudentMarks(40, 88));
        set3.add(new StudentMarks(97, 19));

        // Practically this should give True but it will give False
        System.out.println(set3.contains(new StudentMarks(100, 38)));

        /* Whenever we insert into a HashSet, a hashcode of that element is generated 
         * and then it is mapped to a perticular bucket, and then from that bucket it checks all 
         * the elements. So two method are involved over here first to generate the hashCode for 
         * which hashCode method is called from the object class as every class extends an Object
         * class if the hashCode class it and second to checks the equality which is equals method.
         * Since we have not overwridden the hashCode method and in the Object class this method 
         * is implemented in such a way that if asked the hashCode of the current obejct then it 
         * will return the memory address and if we are asking for the equals method then it will 
         * compare the reffernce values of two objects.
         * That is why whenever we are crating new object of Student Marks even if having same 
         * value the address are getting changes or new addresss is alloted and as a result the 
         * set is reating them as seperate object
         * To make this work the custom class should implement the hashCode methiod and equal 
         * method before using it in HashSet.
         */
    }
}
