package Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import ComparableAndComparator.StudentMarks;

public class AboutTreeSet {
    public static void main(String args[]) {

        List<StudentMarks> sMarks = new ArrayList<>();
        sMarks.add(new StudentMarks(70, 80));
        sMarks.add(new StudentMarks(38, 10));
        sMarks.add(new StudentMarks(100, 38));
        sMarks.add(new StudentMarks(40, 88));
        sMarks.add(new StudentMarks(97, 19));

        /* Since we have not passed a comparator in the treeSet that would ideally
         * mean that compareTo method would called as it implements comparable and
         * based on the maths marks they would be sorted
         */
        Set<StudentMarks> treeSet = new TreeSet<>(sMarks);

        
        for(StudentMarks x : treeSet) {
            System.out.println(x);
        }

        /* Let's say we don't want to sort the set in Desending order or want to sort the 
         * elements based on the Physics marks then we would send a Comparator in constructor
         */
        Set<StudentMarks> treeSet2 = new TreeSet<>((s1, s2) -> s1.getPhysics() - s2.getPhysics());
        treeSet2.addAll(sMarks);
        System.out.println(treeSet2);

        /* Navigable Set Interface */
        NavigableSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.add(8);
        treeSet3.add(3);
        treeSet3.add(1);
        treeSet3.add(0);

        System.out.println(treeSet3.floor(2));
        System.out.println(treeSet3.higher(2));
        System.out.println(treeSet3.lower(2));
        System.out.println(treeSet3.ceiling(2));
    }
}
