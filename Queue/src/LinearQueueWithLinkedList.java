public class LinearQueueWithLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public void create(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;

        // Time Complexity O(1),Space Complexity O(1)
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
        // Time Complexity O(1),Space Complexity O(1)
    }



    public void enqueue(int value){
        if(head == null){
            create(value);
        }
        else{
            Node node = new Node();
            node.value = value;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }

        // Time Complexity O(1),Space Complexity O(1)

    }

    public int dequeue(){
        if(head == null){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int value = head.value;
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
            return value;
        }

        // Time Complexity O(1),Space Complexity O(1)
    }

    public int peek(){
        if(head == null){
            System.out.println("Queue is empty");
            return  -1;
        }
        return head.value;

        // Time Complexity O(1),Space Complexity O(1)
    }

    public void deleteLinearQueue(){
        head = tail = null;
        // Time Complexity O(1),Space Complexity O(1)
    }


}
