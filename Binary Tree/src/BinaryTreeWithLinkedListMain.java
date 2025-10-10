public class BinaryTreeWithLinkedListMain {

    public static void main(String[] args) {
        BinaryTreeWithLinkedList binaryTree = new BinaryTreeWithLinkedList();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");

        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.search("N11");

        System.out.println(binaryTree.getDeepestNode().value);

        binaryTree.deleteDeepestNode();
        binaryTree.levelOrder();

        binaryTree.delete("N3");
        binaryTree.levelOrder();

        binaryTree.deleteBinaryTree();


































    }

}
