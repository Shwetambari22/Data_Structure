public class CircularDoubleLinkedListImpl {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public CircularDoubleLinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void create(int nodeValue) {
        if (head != null) {
            System.out.println("\nLinked List already exist.");
            return;
        }
        DoubleNode newNode = new DoubleNode();
        newNode.setValue(nodeValue);
        newNode.setNext(newNode);
        newNode.setPrev(newNode);
        head = tail = newNode;
        size++;
        System.out.println("\nLinked List created and value is inserted successfully!");
    }

    public void print() {
        if (head == null) {
            System.out.println("\nNothing to print. List is empty!");
            return;
        }
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.getValue() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.println("-> " + tempNode.getValue());
    }

    public void reversePrint() {
        if (head == null) {
            System.out.println("\nNothing to print. List is empty!");
            return;
        }
        DoubleNode tempNode = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.getValue() + " ");
            tempNode = tempNode.getPrev();
        }
        System.out.println("-> " + tempNode.getValue());
    }

    public void deleteLinkedList() {
        DoubleNode tempNode = head;
        while (tempNode != tail) {
            tempNode.setPrev(null);
            tempNode = tempNode.getNext();
        }
        tail.setNext(null);
        head = tail = null;
        size = 0;
        System.out.println("\nLinked List deleted successfully!");
    }

    public void insertNode(int nodeValue, int location) {
        if (head == null) {
            create(nodeValue);
            return;
        }

        DoubleNode newNode = new DoubleNode();
        newNode.setValue(nodeValue);
        if (location == 0) { //insert at beginning
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            head = newNode;
            tail.setNext(newNode);
        } else if (location >= size) { //insert at the end
            newNode.setNext(head);
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
            head.setPrev(newNode);
        } else { // insert anywhere in between
            DoubleNode tempNode = head;
            for (int i = 1; i <= location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            newNode.setPrev(tempNode);
            tempNode.getNext().setPrev(newNode);
            tempNode.setNext(newNode);
        }
        size++;
    }

    public void searchValue(int nodeValue) {
        if (head == null) {
            System.out.println("\nCannot find value. List is empty!");
            return;
        }

        DoubleNode tmpNode = head;
        for (int i = 0; i < size; i++) {
            if (tmpNode.getValue() == nodeValue) {
                System.out.println("\nValue " + nodeValue + " is present at location " + i);
                return;
            }
            tmpNode = tmpNode.getNext();
        }
        System.out.println("\nValue " + nodeValue + " is not present in the list");
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("\nNode cannot be deleted. List is empty!");
            return;
        }

        if (location == 0) { //delete first node
            if (size == 1) {
                head.setNext(null);
                head.setPrev(null);
                head = tail = null;
                size = 0;
                System.out.println("\nNode deleted");
                return;
            }
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);

        } else if (location >= size - 1) { //delete last node
            if (size == 1) {
                head.setNext(null);
                head.setPrev(null);
                head = tail = null;
                size = 0;
                System.out.println("\nNode deleted");
                return;
            }
            DoubleNode tempNode = head;
            for (int i = 1; i < size - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(head);
            head.setPrev(tempNode);
            tail = tempNode;
        } else {
            DoubleNode tempNode = head;
            for (int i = 1; i <= location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.getNext().getNext().setPrev(tempNode);
            tempNode.setNext(tempNode.getNext().getNext());
        }
        size--;
        System.out.println("\nNode deleted");
    }
}
