public class CircularDoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public void create(int nodeValue){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = node;
        node.prev = node;
        head = node;
        tail = node;
        size = 1;

        // Time Complexity O(1), Space Complexity O(1)
    }

    public void insert(int location,int nodeValue){
        if(head == null){
            create(nodeValue);
        }
        else {
            DoublyNode doublyNode = new DoublyNode();
            doublyNode.value = nodeValue;
            if(location == 0){
                doublyNode.next = head.next;
                doublyNode.prev = null;
                head.next.prev = doublyNode;
                tail.next = doublyNode;
                head = doublyNode;
            }
            else if(location >= size){
                tail.next = doublyNode;
                doublyNode.prev = tail;
                doublyNode.next = head;
                tail = doublyNode;
            }
            else{
                DoublyNode tempNode = head;
                int index = 0;
                while(index < location-1){
                    tempNode = tempNode.next;
                    index++;
                }
                doublyNode.next = tempNode.next;
                doublyNode.prev = tempNode;
                tempNode.next.prev = doublyNode;
                tempNode.next = doublyNode;
            }
            size++;
        }

        // Time Complexity O(n),Space Complexity O(1)
    }

    public void traverse(){
        if(head == null){
            System.out.println("Circular Doubly Linked List does not exists");
        }
        else{
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println();

        // Time Complexity O(n),Space Complexity O(1)
    }


    public void reverseTraverse(){
        if(head == null){
            System.out.println("Circular Doubly linked list does not exists");
        }
        else{
            DoublyNode tempNode = tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.prev;
            }
        }
        System.out.println();
        // Time Complexity O(n),Space Complexity O(1)
    }

    public void search(int nodeValue){
        if(head == null){
            System.out.println("Circular Doubly Linked List does not exists");
        }
        else{
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Element found at position "+i);
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Element not found");
        }

        // Time Complexity O(n), Space Complexity O(1)
    }

    public void delete(int location){
        if(head == null){
            System.out.println("Circular Doubly linked list does not exists");
        }
        else{
            if(location == 0){
                if(size == 1){
                    head = null;
                    tail = null;
                }
                else{
                    head.next.prev = null;
                    head = head.next;
                    tail.next = head;
                }
            }
            else if(location >= size){
                tail.prev.next = head;
                tail = tail.prev;
            }
            else{
                DoublyNode tempNode = head;
                for(int i=0; i<location-1;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;
            }
            size--;
        }

        // Time Complexity O(n),Space Complexity O(1)
    }

    public void deleteSDLL() {
        DoublyNode tempNode = head;
        for(int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been deleted!");

        // Time Complexity O(n),Space Complexity O(1)
    }




}
