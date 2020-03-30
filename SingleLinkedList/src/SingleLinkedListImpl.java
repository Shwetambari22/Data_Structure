public class SingleLinkedListImpl {
    private SingleNode head;
    private SingleNode tail;

    public SingleLinkedListImpl() {
        this.head = null;
        this.tail = null;
    }

    public void create(int nodeValue) {
        if (head != null) {
            System.out.println("\nLinked List already exist.");
            return;
        }

        SingleNode newNode = new SingleNode();
        newNode.setValue(nodeValue);
        newNode.setNext(null);
        head = newNode;
        tail = newNode;
        System.out.println("\nLinked List created and value is inserted successfully!");
    }

    public void print() {
        if (head == null) {
            System.out.println("\nCannot print. List is empty!");
            return;
        }

        SingleNode tmpNode = head;
        while (true) {
            System.out.print(tmpNode.getValue() + " ");
            if (tmpNode.getNext() == null)
                return;
            tmpNode = tmpNode.getNext();
        }
    }

    public void insertNode(int nodeValue, int location) {
        if (head == null) {
            create(nodeValue);
            return;
        }

        SingleNode newNode = new SingleNode();
        newNode.setValue(nodeValue);
        if (location == 1) { //insert at beginning
            newNode.setNext(head);
            head = newNode;
        } else if (location == 0) { //insert at the end
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
        } else { // insert anywhere in between
            SingleNode tempNode = head;
            int currentNodeNumber = 1;
            while ((currentNodeNumber < location - 1) && tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
                currentNodeNumber++;
            }
            if (tempNode.getNext() == null) {
                tail = newNode;
            }
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
    }

    public void searchValue(int nodeValue) {
        if (head == null) {
            System.out.println("\nCannot find value. List is empty!");
            return;
        }

        SingleNode tmpNode = head;
        int currentNodePosition = 1;
        while (true) {
            if (tmpNode.getValue() == nodeValue) {
                System.out.println(" Value " + nodeValue + " is present at location " + currentNodePosition);
                return;
            }

            if (tmpNode.getNext() == null) {
                System.out.println(nodeValue + " is not available in the list");
                return;
            }
            tmpNode = tmpNode.getNext();
            currentNodePosition++;
        }
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("\nNode cannot be deleted. List is empty!");
            return;
        }

        if (location == 1) { //delete first node
            if (head == tail) {
                head = tail = null;
                System.out.println("\nNode deleted");
                return;
            }
            head = head.getNext();
        } else if (location == 0) { //delete last node
            if (head == tail) {
                head = tail = null;
                System.out.println("\nNode deleted");
                return;
            }

            SingleNode tempNode = head;
            while (tempNode.getNext().getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
            tail = tempNode;
        } else {
            SingleNode tempNode = head;
            int currentNodePosition = 1;
            while ((currentNodePosition < location - 1) && (tempNode.getNext().getNext() != null)) {
                tempNode = tempNode.getNext();
                currentNodePosition++;
            }
            if (tempNode.getNext().getNext() == null) {
                tail = tempNode;
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
        System.out.println("\nNode deleted");
    }

    public void deleteLinkedList() {
        head = tail = null;
        System.out.println("\nLinked List deleted successfully!");
    }
}
