public class StackMain {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();

        //Test Create
        stack.create();

        //Test Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //Test pop
        System.out.println("Value poped from stack ");
        stack.pop();
        System.out.println("Value poped from stack ");
        stack.pop();

        //adding more value
        stack.push(100);
        stack.push(200);
        System.out.println("Peek value ");
        stack.peek();
        stack.push(300);
        System.out.println("Value poped from stack ");
        stack.pop();
        System.out.println("Value poped from stack ");
        stack.pop();
        System.out.println("Peek value ");
        stack.peek();
        stack.push(400);

        //Test Peek
        System.out.println("Value at the top of stack ");
        stack.peek();

        //Deleting stack by pop
        System.out.println("Popping values");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        //Test Reset
        stack.push(1000);
        stack.push(2000);
        stack.push(3000);
        System.out.println("Peek value");
        stack.peek();
        System.out.println("Delete stack");
        stack.deleteStack();

        //Test Pop and peek
        System.out.println("Value poped from stack ");
        stack.pop();
        System.out.println("Value at the top of stack ");
        stack.peek();


    }
}
