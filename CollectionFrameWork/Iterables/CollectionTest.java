package Iterables;

import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    /* We cannot iterte over because the list is not public. But we cannot expose the inner list outside which will be the violtion of abstraction principal and if in future we change the inner implementation from list to array list then the client code will fails since in arraylist we do not get the .get() unlike list 
            for(int i : list) {

            }
    */
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /* This lines of code can be simply be written in the below manner
           internally they also call the hasNext and next method
        */
        for(int x : list) {
            System.out.println(x);
        }
    }
}
