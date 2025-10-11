import java.util.LinkedList;
import java.util.Queue;

public class AVLTreeWithLInkedList {

    BinaryTreeNode root;

    public AVLTreeWithLInkedList(){
        root = null;
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

        // Time Complexity O(n),Space Complexity O(n)
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

        // Time Complexity O(n),Space Complexity O(n)
    }

    void inOrder(BinaryTreeNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);

        // Time Complexity O(n),Space Complexity O(n)

    }

    public void levelOrder(BinaryTreeNode roots){
        if(roots == null){
            return;
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(roots);
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

        // Time Complexity O(n),Space Complexity O(n)
    }

    public BinaryTreeNode search(BinaryTreeNode node,int value){
        if(node == null){
            System.out.println("Tree is empty");
            return null;
        }
        else if(node.value == value){
            System.out.println("Value found");
            return node;
        }
        else if(value < node.value){
            return search(node.left,value);
        }
        else{
            return search(node.right,value);
        }
    }


    // insert node

    // get height
    public int getheight(BinaryTreeNode node){
        if(node == null){
            return 0;
        }
        else{
            return node.height;
        }
    }

    public BinaryTreeNode rotateRight(BinaryTreeNode disbalanceNode){
        BinaryTreeNode newRoot = disbalanceNode.left;
        disbalanceNode.left = disbalanceNode.left.right;
        newRoot.right = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getheight(disbalanceNode.left),getheight(disbalanceNode.right));
        newRoot.height = 1 + Math.max(getheight(newRoot.left),getheight(newRoot.right));
        return newRoot;
    }

    public BinaryTreeNode rotateLeft(BinaryTreeNode disbalanceNode){
        BinaryTreeNode newRoot = disbalanceNode.right;
        disbalanceNode.right = disbalanceNode.right.left;
        newRoot.left = disbalanceNode;
        disbalanceNode.height = 1 + Math.max(getheight(disbalanceNode.left),getheight(disbalanceNode.right));
        newRoot.height = 1 + Math.max(getheight(newRoot.left),getheight(newRoot.right));
        return newRoot;
    }

    // getBalance
    public int getBalance(BinaryTreeNode node){
        if(node == null){
            return 0;
        }
        return getheight(node.left) - getheight(node.right);
    }

    //insert method
    public BinaryTreeNode insert(BinaryTreeNode node,int value) {
        if (node == null) {
            BinaryTreeNode newNode = new BinaryTreeNode();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            node.left = insert(node.left, value);
        }

        node.height = 1 + Math.max(getheight(node.left), getheight(node.right));
        int balance = getBalance(node);

        // LL condition
        if (balance > 1 && value < node.left.value) {
            return rotateRight(node);
        }
        //LR
        if (balance > 1 && value > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RR
        if (balance < -1 && value > node.right.value) {
            return rotateLeft(node);
        }

        //RL
        if (balance < -1 && value < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public BinaryTreeNode insert(int value){
       root =  insert(root, value);
       return root;
    }
}
