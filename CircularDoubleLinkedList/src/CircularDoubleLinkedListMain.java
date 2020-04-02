public class CircularDoubleLinkedListMain {
    public static void main(String[] args) {

        CircularDoubleLinkedListImpl circularDLL = new CircularDoubleLinkedListImpl();

        //Test Create
        circularDLL.print();
        circularDLL.create(100);
        circularDLL.print();

        //Reset
        circularDLL.deleteLinkedList();
        circularDLL.print();

        //Test insert
        circularDLL.insertNode(100, 0);
        System.out.println("\nAdding 100 at location 0");
        circularDLL.print();

        circularDLL.insertNode(200, 0);
        System.out.println("\nAdding 200 at location 0");
        circularDLL.print();

        circularDLL.insertNode(300, 2);
        System.out.println("\nAdding 300 at location 2");
        circularDLL.print();

        circularDLL.insertNode(400, 1);
        System.out.println("\nAdding 400 at location 1");
        circularDLL.print();

        circularDLL.insertNode(500, 10);
        System.out.println("\nAdding 500 at location 10");
        circularDLL.print();

        circularDLL.insertNode(600, 3);
        System.out.println("\nAdding 600 at location 3");
        circularDLL.print();

        //Test reverse traversal
        System.out.println("\nReverse Print");
        circularDLL.reversePrint();

        //Test search
        circularDLL.searchValue(1000);
        circularDLL.searchValue(200);
        circularDLL.searchValue(500);
        circularDLL.searchValue(100);
        circularDLL.searchValue(300);

        //Reset
        circularDLL.deleteLinkedList();
        circularDLL.reversePrint();

        //Test Delete
        //case1: when no list
        circularDLL.deleteNode(3);

        //case2: deleting 0th node when only one node
        circularDLL.create(10);
        circularDLL.print();
        System.out.println("\nDeleting node from location 0");
        circularDLL.deleteNode(0);
        circularDLL.print();

        //case3: deleting 0th node in a list with 3 nodes
        circularDLL.create(10);
        circularDLL.insertNode(20, 0);
        circularDLL.insertNode(30, 0);
        circularDLL.print();
        System.out.println("\nDeleting node from location 0");
        circularDLL.deleteNode(0);
        circularDLL.print();
        System.out.println("\nPrint reverse");
        circularDLL.reversePrint();

        //reset
        circularDLL.deleteLinkedList();
        circularDLL.print();

        //case4: deleting last node when only one node
        circularDLL.create(100);
        circularDLL.print();
        System.out.println("\nDeleting node from location 1");
        circularDLL.deleteNode(1);
        circularDLL.print();

        //case5: deleting last node in a list with 3 nodes
        circularDLL.create(100);
        circularDLL.insertNode(200, 0);
        circularDLL.insertNode(300, 0);
        circularDLL.print();
        System.out.println("\nDeleting node from location 2");
        circularDLL.deleteNode(2);
        circularDLL.print();
        System.out.println("\nPrint reverse");
        circularDLL.reversePrint();

        //reset
        circularDLL.deleteLinkedList();
        circularDLL.print();

        //case6: deleting any node between first and last
        circularDLL.create(15);
        circularDLL.insertNode(25, 0);
        circularDLL.insertNode(35, 0);
        circularDLL.insertNode(45, 0);
        circularDLL.insertNode(55, 0);
        circularDLL.print();
        System.out.println("\nDeleting node from location 3");
        circularDLL.deleteNode(3);
        circularDLL.print();
        System.out.println("\nPrint reverse");
        circularDLL.reversePrint();

        //case7: deleting node where location > list size
        System.out.println("\nDeleting node from location 10");
        circularDLL.deleteNode(10);
        circularDLL.print();
        System.out.println("\nPrint reverse");
        circularDLL.reversePrint();

        System.out.println("\nDeleting node from location 1");
        circularDLL.deleteNode(1);
        circularDLL.print();
        System.out.println("\nPrint reverse");
        circularDLL.reversePrint();

        //reset
        circularDLL.deleteLinkedList();
        circularDLL.print();
    }
}
