public class SingleLinkedListMain {

    public static void main(String[] args) {
        SingleLinkedListImpl singleLL = new SingleLinkedListImpl();

        //test create and print
        singleLL.create(10);
        singleLL.print();
        singleLL.create(20);

        //Reset
        singleLL.deleteLinkedList();
        singleLL.print();

        //test insert.
        singleLL.insertNode(20, 4);
        System.out.println("\nAdding 20 at location 4");
        singleLL.print();

        singleLL.insertNode(25, 1);
        System.out.println("\nAdding 25 at location 1");
        singleLL.print();

        singleLL.insertNode(30, 0);
        System.out.println("\nAdding 30 at location 0-last position");
        singleLL.print();

        singleLL.insertNode(40, 3);
        System.out.println("\nAdding 40 at location 3");
        singleLL.print();

        singleLL.insertNode(50, 10); // will add at the end
        System.out.println("\nAdding 50 at location 10");
        singleLL.print();

        //test search
        System.out.println("\n");
        singleLL.searchValue(20);
        singleLL.searchValue(30);
        singleLL.searchValue(40);
        singleLL.searchValue(50);
        singleLL.searchValue(100);

        //Reset
        singleLL.deleteLinkedList();
        singleLL.print();

        //test delete
        //case1: when no list
        singleLL.deleteNode(3);

        //case2: deleting 1st node when only one node
        singleLL.create(10);
        singleLL.print();
        System.out.println("\nDeleting node from location 1");
        singleLL.deleteNode(1);
        singleLL.print();

        //case3: deleting first node in a list with 3 nodes
        singleLL.create(10);
        singleLL.insertNode(20, 0);
        singleLL.insertNode(30, 0);
        singleLL.print();
        System.out.println("\nDeleting node from location 1");
        singleLL.deleteNode(1);
        singleLL.print();

        //reset
        singleLL.deleteLinkedList();
        singleLL.print();

        //case4: deleting last node when only one node
        singleLL.create(100);
        singleLL.print();
        System.out.println("\nDeleting node from location 0 -last");
        singleLL.deleteNode(0);
        singleLL.print();

        //case5: deleting last node in a list with 3 nodes
        singleLL.create(100);
        singleLL.insertNode(200, 0);
        singleLL.insertNode(300, 0);
        singleLL.print();
        System.out.println("\nDeleting node from location 0 -last");
        singleLL.deleteNode(0);
        singleLL.print();

        //reset
        singleLL.deleteLinkedList();
        singleLL.print();

        //case6: deleting any node between first and last
        singleLL.create(15);
        singleLL.insertNode(25, 0);
        singleLL.insertNode(35, 0);
        singleLL.insertNode(45, 0);
        singleLL.insertNode(55, 0);
        singleLL.print();
        System.out.println("\nDeleting node from location 3");
        singleLL.deleteNode(3);
        singleLL.print();

        //case7: deleting node where location > list size
        System.out.println("\nDeleting node from location 10");
        singleLL.deleteNode(10);
        singleLL.print();

        System.out.println("\nDeleting node from location 2");
        singleLL.deleteNode(2);
        singleLL.print();

        //reset
        singleLL.deleteLinkedList();
        singleLL.print();
    }
}
