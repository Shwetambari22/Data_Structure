public class CircularSingleLinkedListImpl {
    private SingleNode head;
    private SingleNode tail;
    int size;

    public CircularSingleLinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void create(int nodeValue) {
        if (head != null) {
            System.out.println("\nLinked List already exist.");
            return;
        }
        SingleNode newNode = new SingleNode();
        newNode.setValue(nodeValue);
        newNode.setNext(newNode);
        head = tail = newNode;
        size++;
        System.out.println("\nLinked List created and value is inserted successfully!");
    }

    public void print() {
        if (head == null) {
            System.out.println("\nNothing to print. List is empty!");
            return;
        }
        SingleNode tempNode = head;
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(tempNode.getValue() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.print(" -> " + tempNode.getValue());
    }

    public void insertNode(int nodeValue, int location) {
        if (head == null) {
            create(nodeValue);
            return;
        }

        SingleNode newNode = new SingleNode();
        newNode.setValue(nodeValue);
        if (location == 0) { //insert at beginning
            newNode.setNext(head);
            head = newNode;
            tail.setNext(newNode);
        } else if (location >= size) { //insert at the end
            newNode.setNext(head);
            tail.setNext(newNode);
            tail = newNode;
        } else { // insert anywhere in between
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
        size++;
    }

    public void deleteLinkedList() {
        tail.setNext(null);
        head = tail = null;
        size = 0;
        System.out.println("\nLinked List deleted successfully!");
    }

    public void searchValue(int nodeValue) {
        if (head == null) {
            System.out.println("\nCannot find value. List is empty!");
            return;
        }

        SingleNode tmpNode = head;
        for (int i = 0; i <= size; i++) {
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
                head = tail = null;
                size = 0;
                System.out.println("\nNode deleted");
                return;
            }
            head = head.getNext();
            tail.setNext(head);
        } else if (location >= size - 1) { //delete last node
            if (size == 1) {
                head.setNext(null);
                head = tail = null;
                size = 0;
                System.out.println("\nNode deleted");
                return;
            }
            SingleNode tempNode = head;
            for (int i = 1; i < size - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(head);
            tail = tempNode;
        } else {
            SingleNode tempNode = head;
            for (int i = 1; i <= location - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
        size--;
        System.out.println("\nNode deleted");
    }
}
