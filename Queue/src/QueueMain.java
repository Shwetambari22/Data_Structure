public class QueueMain {
    public static void main(String[] args) {
        
        QueueImpl queue = new QueueImpl();

        //Test Create
        queue.create();

        //Test Push
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        //Test pop
        queue.dequeue();
        queue.dequeue();

        //adding more value
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Peek value ");
        queue.peek();
        queue.enqueue(300);
        queue.dequeue();
        queue.dequeue();
        System.out.println("Peek value ");
        queue.peek();
        queue.enqueue(400);

        //Test Peek
        System.out.println("Peek value ");
        queue.peek();

        //Deleting queue by removing elements
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //Test Reset
        queue.enqueue(1000);
        queue.enqueue(2000);
        queue.enqueue(3000);
        System.out.println("Peek value");
        queue.peek();
        System.out.println("Delete queue");
        queue.deleteQueue();

        //Test Pop and peek
        queue.dequeue();
        queue.peek();
    }
}
