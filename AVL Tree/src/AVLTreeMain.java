public class AVLTreeMain {
    public static void main(String[] args) {
        AVLTreeWithLInkedList avlTree = new AVLTreeWithLInkedList();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(40);
        avlTree.insert(50);
        avlTree.insert(60);
        avlTree.insert(70);
        avlTree.insert(80);
        System.out.println(avlTree.root);
        avlTree.levelOrder(avlTree.root);
    }
}