public class DoubleLinkedListImpl {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleLinkedListImpl() {
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
        newNode.setNext(null);
        newNode.setPrev(null);
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
            newNode.setPrev(null);
            head.setPrev(newNode);
            head = newNode;
        } else if (location >= size) { //insert at the end
            newNode.setNext(null);
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
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

    public void deleteLinkedList() {
        DoubleNode tempNode = head;
        while (tempNode != tail) {
            tempNode.setPrev(null);
            tempNode.getNext().setPrev(null);
            tempNode = tempNode.getNext();
        }
        head = tail = null;
        size = 0;
        System.out.println("\nLinked List deleted successfully!");
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
                head = tail = null;
                size = 0;
                System.out.println("\nNode deleted");
                return;
            }
            head.getNext().setPrev(null);
            head = head.getNext();
        } else if (location >= size - 1) { //delete last node
            if (size == 1) {
                head = tail = null;
                size = 0;
                System.out.println("\nNode deleted");
                return;
            }
            DoubleNode tempNode = head;
            for (int i = 1; i < size - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
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
