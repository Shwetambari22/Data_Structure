public class CircularSingleLinkedListMain {

    public static void main(String[] args) {

        CircularSingleLinkedListImpl circularSLL = new CircularSingleLinkedListImpl();

        //Test Create
        circularSLL.create(10);
        circularSLL.print();
        circularSLL.create(20);

        //reset
        circularSLL.deleteLinkedList();
        circularSLL.print();

        //Test Insert
        circularSLL.insertNode(10, 2);
        System.out.println("\nAdding 10, when list does not exist");
        circularSLL.print();

        circularSLL.insertNode(20, 0);
        System.out.println("\nAdding 20, at beginning");
        circularSLL.print();

        circularSLL.insertNode(30, 2);
        System.out.println("\nAdding 30, at end");
        circularSLL.print();

        circularSLL.insertNode(40, 10);
        System.out.println("\nAdding 40, at location 10");
        circularSLL.print();

        circularSLL.insertNode(50, 3);
        System.out.println("\nAdding 50, at location 3");
        circularSLL.print();

        //Test Search
        circularSLL.searchValue(40);
        circularSLL.searchValue(20);
        circularSLL.searchValue(100);
        circularSLL.searchValue(30);

        //Reset
        circularSLL.deleteLinkedList();
        circularSLL.print();

        //test Delete
        //case1: when no list
        circularSLL.deleteNode(3);

        //case2: deleting 0th node when only one node
        circularSLL.create(10);
        circularSLL.print();
        System.out.println("\nDeleting node from location 0");
        circularSLL.deleteNode(0);
        circularSLL.print();

        //case3: deleting 0th node in a list with 3 nodes
        circularSLL.create(10);
        circularSLL.insertNode(20, 0);
        circularSLL.insertNode(30, 0);
        circularSLL.print();
        System.out.println("\nDeleting node from location 0");
        circularSLL.deleteNode(0);
        circularSLL.print();

        //reset
        circularSLL.deleteLinkedList();
        circularSLL.print();

        //case4: deleting last node when only one node
        circularSLL.create(100);
        circularSLL.print();
        System.out.println("\nDeleting node from location 1");
        circularSLL.deleteNode(1);
        circularSLL.print();

        //case5: deleting last node in a list with 3 nodes
        circularSLL.create(100);
        circularSLL.insertNode(200, 0);
        circularSLL.insertNode(300, 0);
        circularSLL.print();
        System.out.println("\nDeleting node from location 2");
        circularSLL.deleteNode(2);
        circularSLL.print();

        //reset
        circularSLL.deleteLinkedList();
        circularSLL.print();

        //case6: deleting any node between first and last
        circularSLL.create(15);
        circularSLL.insertNode(25, 0);
        circularSLL.insertNode(35, 0);
        circularSLL.insertNode(45, 0);
        circularSLL.insertNode(55, 0);
        circularSLL.print();
        System.out.println("\nDeleting node from location 3");
        circularSLL.deleteNode(3);
        circularSLL.print();

        //case7: deleting node where location > list size
        System.out.println("\nDeleting node from location 10");
        circularSLL.deleteNode(10);
        circularSLL.print();

        System.out.println("\nDeleting node from location 1");
        circularSLL.deleteNode(1);
        circularSLL.print();

        //reset
        circularSLL.deleteLinkedList();
        circularSLL.print();
    }
}
