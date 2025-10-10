import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeWithLinkedList {

    BinaryTreeNode root;

    public BinaryTreeWithLinkedList() {
        root = null;

        // Time Complexity O(1),Space complexity O(1)
    }

    public void preOrder(BinaryTreeNode node){
        if(node == null){
            return;
        }
        else{
            System.out.print(node.value+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(BinaryTreeNode node){
        if(node == null){
            return;
        }
        else{
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value+" ");

        }
    }

    void inOrder(BinaryTreeNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);

    }

    public void levelOrder(BinaryTreeNode node){
        if(node == null){
            return;
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(node);
            while(!queue.isEmpty()){
                BinaryTreeNode presentNode = queue.remove();
                System.out.print(presentNode.value+" ");
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
    }
}
