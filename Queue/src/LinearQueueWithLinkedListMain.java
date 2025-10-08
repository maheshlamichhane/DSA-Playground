public class LinearQueueWithLinkedListMain {

    public static void main(String[] args) {

        LinearQueueWithLinkedList queue = new LinearQueueWithLinkedList();
        queue.create(10);
        queue.enqueue(11);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.deleteLinearQueue();
        queue.dequeue();
    }
}
