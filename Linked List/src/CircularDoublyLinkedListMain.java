public class CircularDoublyLinkedListMain {
    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.create(10);
        list.insert(0,5);
        list.insert(3,100);
        list.insert(2,200);
        list.search(1000);

        list.delete(2);
        list.deleteSDLL();


        list.traverse();
        list.reverseTraverse();
    }
}
