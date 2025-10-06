public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node create(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

        // Time Complexity O(1), Space Complexity O(1)
    }

    public void insert(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head ==  null){
            create(nodeValue);
        }
        else if(location == 1){
            node.next = head;
            head = node;
        }
        else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
            Node tempNode = head;
            int index = 0;
            while(index < location -1){
                tempNode = tempNode.next;
                index++;
            }

            node.next = tempNode.next;
            tempNode.next = node;

        }
        size++;

        // Time Complexity O(n) and Space Complexity O(1)
    }

    public void traverse(){
        if(head == null){
            System.out.println("SLL does not exists");
        }
        else{
            Node tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if(i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }

        // Time Complexity O(n) and Space Complexity O(1)
    }

    public boolean search(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Element found");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Element not found");
        return false;

        // Time Complexity O(n), Space Complexity O(1)
    }

    public void delete(int location){
        if(head == null){
            System.out.println("SLL not exists");
        }
        else{
            if(location == 1){
                head = head.next;
                size--;
                if(size == 0){
                    tail = null;
                }
            }
            else if(location >= size){
                Node tempNode = head;
                for(int i=0; i<size-1; i++){
                    tempNode = tempNode.next;
                }
                if(tempNode == head){
                    tail = head = null;
                    size--;
                }
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
            else{
                Node tempNode = head;
                for(int i=1; i<location-1; i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }

        // Time Complexity O(n),Space Complexity O(1)
    }

    public void deleteSLL(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("SLL deleted successfully");

        // Time Complexity O(1), Space Complexity O(1)
    }


}
