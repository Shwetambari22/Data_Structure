public class QueueImpl {
    private SingleNode head;
    private SingleNode tail;

    public void create(){
        head = tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void deleteQueue(){
        head = tail = null;
    }

    public void enqueue(int value){
        SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(head);
        if(tail == null){
            tail = node;
        }
        head = node;
        System.out.println(value + " is added in the queue");
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        if(head == tail){
            System.out.println("Value dequeued "+ head.getValue());
            head = tail = null;
            return;
        }

        SingleNode tempNode = head;
        while( tempNode.getNext().getNext() != null){
            tempNode = tempNode.getNext();
        }
        System.out.println("Value dequeued "+ tempNode.getNext().getValue());
        tempNode.setNext(null);
        tail = tempNode;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(tail.getValue());
    }
}
