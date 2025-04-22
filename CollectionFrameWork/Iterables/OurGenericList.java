package Iterables;
import java.util.Iterator;

/* T is nothing but a placeholder where the Java compiler will give any datatype (Java generics) */
public class OurGenericList<T> implements Iterable<T> {
    /* We cannot expose the inner list outside which will be a violation of the abstraction principle.
       If in the future we change the inner implementation from list to array list then the client code will fail 
       since in ArrayList we do not get the get() method unlike list.
    
    The basic crux is we should only expose the functionalities, not the internal implementation details of this class */   
    private T[] items;
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemsAtIndex(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> {
        private OurGenericList<T> list;
        private int index = 0;

        OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("hasNext method is called");
            return index < list.size;
        }

        @Override
        public T next() {
            System.out.println("next method is called");
            /* Returning the current element and incrementing the index */
            return list.items[index++];
        }
    }
}
