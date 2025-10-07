public class DoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public void create(int nodeValue){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;

        // Time Complexity O(1),Space Complexity O(1)
    }

    public void insert(int location,int nodeValue){

       if(head == null){
           create(nodeValue);
       }
       else{
           DoublyNode doublyNode = new DoublyNode();
           doublyNode.value = nodeValue;
           if(location == 0){
               doublyNode.next = head;
               doublyNode.prev = null;

               head.prev = doublyNode;
               head = doublyNode;
           }
           else if(location >= size){

               doublyNode.next = null;
               tail.next = doublyNode;
               doublyNode.prev = tail;
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

               tempNode.next = doublyNode;
               doublyNode.next.prev = doublyNode;

           }
           size++;
       }

       // Time Complexity O(n),Space Complexity O(1)
    }


    public void traverse(){
        if(head == null){
            System.out.println("Doubly linked list does not exists");
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

    public void traverseReverse(){
        if(head == null){
            System.out.println("Doubly linked list does not exists");
        }
        else{
            DoublyNode tempNode = tail;
            for(int i=0; i<size; i++){
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

    public void delete(int location){
        if(head == null){
            System.out.println("Double linked list does not exists");
        }
        else{

            if(location == 0){
                if(size == 1){
                    head = tail = null;
                }
                else{
                    head.next.prev = null;
                    head = head.next;
                }

            }

            else if(location >= size){
                tail.prev.next = null;
                tail = tail.prev;

            }
            else{
                DoublyNode tempNode = head;
                for(int i=0; i<location-1; i++){
                    tempNode = tempNode.next;
                }

                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;

            }
            size--;
        }

        // Time Complexity O(n),Space Complexity O(1)
    }

    public boolean search(int nodeValue){
        if(head == null){
            System.out.println("Double Linked list is does not exists");
        }
        else{
            DoublyNode tempNode = head;
            for(int i=0; i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Element found at index "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Element not found");
        return false;

        // Time Complexity O(n),Space Complexity O(1)

    }

    public void deleteDLL(){
        DoublyNode tempNode = head;
        for(int i=0; i<size;i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been deleted!");

        // Time Complexity O(n),Space Complexity O(1)
    }


}
