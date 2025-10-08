public class StackWithLinkedListMain {

    public static void main(String[] args) {

        StackWithLinkedList stack = new StackWithLinkedList();
        stack.create(10);
        stack.push(20);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }

}
