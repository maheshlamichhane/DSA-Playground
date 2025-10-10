public class BinaryTreeWithLinkedListMain {

    public static void main(String[] args) {
        BinaryTreeWithLinkedList binaryTree = new BinaryTreeWithLinkedList();
        BinaryTreeNode N1 = new BinaryTreeNode();
        N1.value = "N1";
        BinaryTreeNode N2 = new BinaryTreeNode();
        N2.value = "N2";
        BinaryTreeNode N3 = new BinaryTreeNode();
        N3.value = "N3";
        N1.left = N2;
        N1.right = N3;

        BinaryTreeNode N4 = new BinaryTreeNode();
        N4.value = "N4";
        BinaryTreeNode N5 = new BinaryTreeNode();
        N5.value = "N5";
        N2.left = N4;
        N2.right = N5;

        BinaryTreeNode N6 = new BinaryTreeNode();
        N6.value = "N6";
        BinaryTreeNode N7 = new BinaryTreeNode();
        N7.value = "N7";
        N3.left = N6;
        N3.right = N7;

        BinaryTreeNode N8 = new BinaryTreeNode();
        N8.value = "N8";
        BinaryTreeNode N9 = new BinaryTreeNode();
        N9.value = "N9";
        N4.left = N8;
        N4.right = N9;

//        binaryTree.preOrder(N1);
//        binaryTree.postOrder(N1);

//        binaryTree.inOrder(N1);
        binaryTree.levelOrder(N1);


































    }

}
