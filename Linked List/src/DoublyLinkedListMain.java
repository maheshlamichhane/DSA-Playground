public class DoublyLinkedListMain {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.create(10);
        doublyLinkedList.insert(0,5);
        doublyLinkedList.insert(2,15);
        doublyLinkedList.insert(2,12);
        doublyLinkedList.traverse();

//        doublyLinkedList.delete(0);
        doublyLinkedList.delete(5);
        doublyLinkedList.delete(1);
        doublyLinkedList.search(5);
        doublyLinkedList.deleteDLL();
        doublyLinkedList.traverse();
        doublyLinkedList.traverseReverse();

    }
}
