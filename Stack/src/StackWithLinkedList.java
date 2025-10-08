public class StackWithLinkedList {

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

    public void push(int value){
        if(head == null){
            create(value);
        }
        else{
            Node node = new Node();
            node.value = value;
            node.next = head;
            head = node;
            size++;
        }

        // Time Complexity O(1),Space Complexity O(1)
    }

    public int peek(){
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return head.value;
        }

        // Time Complexity O(1),Space Complexity O(1)
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            head = head.next;
            size--;
            if(size == 0){
                head = tail = null;
            }
        }

        // Time Complexity O(1),Space Complexity O(1)
    }

    public void deleteStack(){
        head = tail = null;
        // Time Complexity O(1),Space Complexity O(1)

    }

}
