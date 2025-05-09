package LinkedList;

public class Test {
    public static void main(String[] args) {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.addAtFirst("Orange");
        // list.printList();
        list.delete("Apple");
        // System.out.println("Is Apple present ? " + list.contains("Apple"));
        // list.printList();

        OurDoubleLinkedList<String> dlist = new OurDoubleLinkedList<>();
        dlist.add("Apple");
        dlist.addAtFirst("Mango");
        dlist.addAtPosition(2, "Watermelon");
        System.out.println("Is Mango present ? " + dlist.contains("Mango"));
        dlist.printList();
        dlist.delete("Apple");
        dlist.printList();
    }
}
