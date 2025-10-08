
public class QueueWithArrayMain {
    public static void main(String[] args) {

        QueueWithArray queue = new QueueWithArray();
        queue.create(3);
        queue.Enqueue(3);
        queue.Enqueue(4);
        System.out.println(queue.peek());
        queue.Dequeue();
        System.out.println(queue.peek());
    }

}