package LinkedList;

public class OurLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAtFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtPosition(int position, T data) {
        if(position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) addAtFirst(data);

        Node<T> newNode = new Node<T>(data);
        Node<T> curr = head;
        int positionCounter = 1;

        while(curr != null && positionCounter != position - 1) {
            positionCounter++;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("The position is not present");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void delete(T data) {
        if(head == null) return;

        if(head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while(current.next != null) {
            if(current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while(current != null) {
            if(current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node<T> current = head;
        while(current != null) {
            System.out.print(current.data + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }
}
