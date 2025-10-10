public class BinarySearchTreeWithLinkedListMain {
    public static void main(String[] args) {
        BinarySearchTreeWithLinkedList bst = new BinarySearchTreeWithLinkedList();
        bst.insert(20);
        bst.insert(8);
        bst.insert(25);
        bst.insert(10);
        bst.insert(15);
        bst.levelOrder();
        System.out.println();
        bst.search(11);
        System.out.println();
        bst.deleteNode(20);
        bst.levelOrder();


    }
}