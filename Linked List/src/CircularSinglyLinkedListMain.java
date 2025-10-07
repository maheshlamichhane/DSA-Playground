public class CircularSinglyLinkedListMain {

    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.create(20);
        circularSinglyLinkedList.insert(10,0);
        circularSinglyLinkedList.insert(15,1);
        circularSinglyLinkedList.insert(18,2);
        circularSinglyLinkedList.insert(25,4);
//        circularSinglyLinkedList.search(25);
        circularSinglyLinkedList.delete(2);
        circularSinglyLinkedList.deleteCircularSLL();

        circularSinglyLinkedList.traverse();
    }
}
