package LinkedList;

public class OurDoubleLinkedList<T> {
    private Node<T> head ;
    private Node<T> end;

    public void  add(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
            end = newNode;
            return;
        } else {
            newNode.prev = end;
            end.next = newNode;
            end = newNode;
        }
    }

    public void addAtFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
            end = newNode;
            return;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtPosition(int position, T data) {
        if(position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if(position == 1) {
            addAtFirst(data);
            return;
        }

        Node<T> newNode = new Node<T>(data);
        int positionCounter = 1;
        Node<T> current = head;

        while(current != null && positionCounter != position - 1) {
            positionCounter++;
            current = current.next;
        }

        if (current == null) {
            System.out.println("The position is not present");
            return;
        }
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            end = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void delete(T data) {
        if(head == null) {
            System.out.println("No node present to delete");
            return;
        }
        
        if(head.data.equals(data)) {
            head = head.next;
            if(head != null) head.prev = null;
            else end = null;
            return;
        }
        Node<T> current = head;

        while(current.next != null) {
            if(current.next.data.equals(data)) {
                Node<T> nodeToDelete = current.next;
                current.next = nodeToDelete.next;
                if (nodeToDelete.next != null) {
                    nodeToDelete.next.prev = current;
                } else {
                    end = current; // Deleted last node
                }
                nodeToDelete.next = null;
                nodeToDelete.prev = null;
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
            System.out.print(current.data + (current.next != null ? " = " : ""));
            current = current.next;
        }
        System.out.println();
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
