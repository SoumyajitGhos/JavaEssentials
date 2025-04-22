package ComparableAndComparator;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<StudentMarks> {

    @Override
    public int compare(StudentMarks o1, StudentMarks o2) {
        return o1.getMaths() - o2.getMaths();
    }

}