import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MoreStuffsOnCollection {
    public static void main(String args[]) {
        Integer arr[] = new Integer[] {1, 4, 2, 10, 3, 5, 4, 6};

        /* Sort an array */
        Arrays.sort(arr);

        /* Store an Array in a List */
        List<Integer> lst = Arrays.asList(arr);

        /* Sort array in reverse Order */
        Collections.sort(Arrays.asList(arr), Collections.reverseOrder());

        /* Binary Search in an Array */
        Collections.binarySearch(lst, 2);
    }
}
