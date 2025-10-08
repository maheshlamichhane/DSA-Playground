
public class LinearQueueWithArrayMain {
    public static void main(String[] args) {

        LinearQueueWithArray queue = new LinearQueueWithArray();
        queue.create(3);
        queue.Enqueue(3);
        queue.Enqueue(4);
        System.out.println(queue.peek());
        queue.Dequeue();
        System.out.println(queue.peek());
    }

}