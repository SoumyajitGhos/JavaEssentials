import java.util.List;
import java.util.ArrayList;

public class AboutArrayList {
    public static void main(String [] args) {
        List<Integer> alist = new ArrayList<>();

        /* Add method to add elements in the list */
        alist.add(1);
        alist.add(2);
        alist.add(3);

        /* Since it is an implementation of List which is an implementation of Iteratble we can iterate through it */
        for(int element : alist) {
            System.out.println(element);
        }

        /* Can directly print the ArrayList since the toString method is being implemented inside it */
        System.out.println(alist);

        /* Could set a specific location with element */
        alist.set(2, 100);
        System.out.println(alist);

        /* Copy a list into anaother one using constructor while declaring 
        We can pass actually any collection in the constructor
        */
        List<Integer> aList2 = new ArrayList<>(alist);

        /***
        Generics only allow Reference types as a parameters so
        List<int> lst = new ArrayList<>(); will give error
        Whenevere we are working with collection, since collections are generic interfaces or any Generic classes we always have to pass "References" as parameter

        ***/

        /* Want to add all the elements of a arrayList into another one not as a copy.. then we use the emethid "Addall" */
        aList2.addAll(alist);

        /* Index of a perticular   element and if same element is present multiple times it will give the index of the last occuring one
         Here you can see the concept of boxing and unboxing where the indexOf method requires an object which is a wrapper class but we are passing primitive type which internally Boxes into Wrapper class
        */
        System.out.println(alist.indexOf(2));

        /* SubList will give a sub list of the list from(inclusive) the index mentioned to(exclusive)the index mentioned */
        List<Integer> aList3 = alist.subList(1, 4);

        /* If we change the aList3 then the alist will also change.. unlike the constructor it does not gives a copy rather it returns the view of the list
         
        It is the concept of shallow copy
        */
        aList3.set(0, 200);
        
        /* Convert ArrayList to normal Array, by convention we give size as 0 while giving the parameter since if the parameter size is less than that of the list size then it will return an array of same size else it wil have empty space if given number greater than the size of the list */
        Integer [] arr = alist.toArray(new Integer[0]);
    }
}
