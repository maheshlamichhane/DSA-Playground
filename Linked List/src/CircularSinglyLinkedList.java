public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node create(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;

        // Time Complexity O(1),Space Complexity O(1)
    }

    public void traverse(){
        if(head == null){
            System.out.println("Circular SLL does not exists");
        }
        else{
            Node tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }

        // Time Complexity O(N), Space Complexity O(1)
    }

    public void insert(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            create(nodeValue);
        }
        else if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }
        else if(location >= size){
            tail.next = node;
            tail = node;
            node.next = head;
        }
        else{
            Node tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;

        // Time Complexity O(n),Space Complexity O(1)
    }

    public boolean search(int nodeValue){
        if(head == null){
            System.out.println("Circular SLL does not exists");
        }
        else{
            Node tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.print("Element found at "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Element not found");

        }
        return false;

        // Time Complexity O(n),Space Complexity O(1)
    }

    public void delete(int location){
        if(head == null){
            System.out.println("Circular SLL does not exists");
        }
        else{
            if(location == 0){
               head = head.next;
               size--;
               if(size == 0){
                   tail = null;
               }

            }
            else if(location >= size){
                Node tempNode = head;
                for(int i=0; i<size-1;i++){
                    tempNode = tempNode.next;
                }
                if(head == tempNode){
                    head = tail = null;
                    size--;
                }

                tempNode.next = head;
                tail = tempNode;
                size--;
            }
            else{
                Node tempNode = head;
                for(int i=0; i<location-1;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;

            }
        }

        // Time Complexity O(n),Space Complexity O(1)
    }

    public void deleteCircularSLL(){
        if(head == null){
            System.out.println("Circular SLL does not exists");
        }
        else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Circular SLL Deleted");
        }

        // Time Complexity O(1), Space complexity O(1)
    }
}
