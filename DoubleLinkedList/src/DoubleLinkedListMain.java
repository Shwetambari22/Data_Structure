public class DoubleLinkedListMain {

    public static void main(String[] args) {

        DoubleLinkedListImpl doubleLL = new DoubleLinkedListImpl();

        //Test Create
        doubleLL.print();
        doubleLL.create(100);
        doubleLL.print();

        //reset
        doubleLL.deleteLinkedList();
        doubleLL.print();

        //Test insert
        doubleLL.insertNode(100, 0);
        System.out.println("\nAdding 100 at location 0");
        doubleLL.print();

        doubleLL.insertNode(200, 0);
        System.out.println("\nAdding 200 at location 0");
        doubleLL.print();

        doubleLL.insertNode(300, 2);
        System.out.println("\nAdding 300 at location 2");
        doubleLL.print();

        doubleLL.insertNode(400, 1);
        System.out.println("\nAdding 400 at location 1");
        doubleLL.print();

        doubleLL.insertNode(500, 10);
        System.out.println("\nAdding 500 at location 10");
        doubleLL.print();

        doubleLL.insertNode(600, 3);
        System.out.println("\nAdding 600 at location 3");
        doubleLL.print();

        //Test search
        doubleLL.searchValue(1000);
        doubleLL.searchValue(200);
        doubleLL.searchValue(500);
        doubleLL.searchValue(100);
        doubleLL.searchValue(300);

        //Test reverse traversal
        doubleLL.print();
        System.out.println("\nReverse Print");
        doubleLL.reversePrint();

        //Reset
        doubleLL.deleteLinkedList();
        doubleLL.reversePrint();

        //Test Delete
        //case1: when no list
        doubleLL.deleteNode(3);

        //case2: deleting 0th node when only one node
        doubleLL.create(10);
        doubleLL.print();
        System.out.println("\nDeleting node from location 0");
        doubleLL.deleteNode(0);
        doubleLL.print();

        //case3: deleting 0th node in a list with 3 nodes
        doubleLL.create(10);
        doubleLL.insertNode(20, 0);
        doubleLL.insertNode(30, 0);
        doubleLL.print();
        System.out.println("\nDeleting node from location 0");
        doubleLL.deleteNode(0);
        doubleLL.print();
        System.out.println("\nPrint reverse");
        doubleLL.reversePrint();

        //reset
        doubleLL.deleteLinkedList();
        doubleLL.print();

        //case4: deleting last node when only one node
        doubleLL.create(100);
        doubleLL.print();
        System.out.println("\nDeleting node from location 1");
        doubleLL.deleteNode(1);
        doubleLL.print();

        //case5: deleting last node in a list with 3 nodes
        doubleLL.create(100);
        doubleLL.insertNode(200, 0);
        doubleLL.insertNode(300, 0);
        doubleLL.print();
        System.out.println("\nDeleting node from location 2");
        doubleLL.deleteNode(2);
        doubleLL.print();
        System.out.println("\nPrint reverse");
        doubleLL.reversePrint();

        //reset
        doubleLL.deleteLinkedList();
        doubleLL.print();

        //case6: deleting any node between first and last
        doubleLL.create(15);
        doubleLL.insertNode(25, 0);
        doubleLL.insertNode(35, 0);
        doubleLL.insertNode(45, 0);
        doubleLL.insertNode(55, 0);
        doubleLL.print();
        System.out.println("\nDeleting node from location 3");
        doubleLL.deleteNode(3);
        doubleLL.print();
        System.out.println("\nPrint reverse");
        doubleLL.reversePrint();

        //case7: deleting node where location > list size
        System.out.println("\nDeleting node from location 10");
        doubleLL.deleteNode(10);
        doubleLL.print();
        System.out.println("\nPrint reverse");
        doubleLL.reversePrint();

        System.out.println("\nDeleting node from location 1");
        doubleLL.deleteNode(1);
        doubleLL.print();
        System.out.println("\nPrint reverse");
        doubleLL.reversePrint();

        //reset
        doubleLL.deleteLinkedList();
        doubleLL.print();
    }
}
