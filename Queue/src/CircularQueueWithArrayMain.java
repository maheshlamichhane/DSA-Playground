public class CircularQueueWithArrayMain {

    public static void main(String[] args) {
        CircularQueueWithArray queue = new CircularQueueWithArray();
        queue.create(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        queue.deleteCircularQueue();


    }
}
