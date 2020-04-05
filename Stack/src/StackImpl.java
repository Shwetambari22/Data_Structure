public class StackImpl {
    private SingleNode head;

    public void create() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(head);
        head = node;
        System.out.println(value + " is pushed into the stack");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        SingleNode tempNode = head;
        head = head.getNext();
        System.out.println(tempNode.getValue());
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println(head.getValue());
    }

    public void deleteStack() {
        head = null;
    }
}
