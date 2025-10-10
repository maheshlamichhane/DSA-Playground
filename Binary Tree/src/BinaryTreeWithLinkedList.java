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

    public void levelOrder(){
        if(root == null){
            return;
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
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

    public void search(String value){
        if(root == null){
            System.out.print("Empty Tree");
            return;
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryTreeNode presentNode = queue.remove();
                if(presentNode.value.equals(value)){
                    System.out.println("Found  "+presentNode.value);
                    return;
                }
                else{
                    if(presentNode.left != null){
                        queue.add(presentNode.left);
                    }
                    if(presentNode.right != null){
                        queue.add(presentNode.right);
                    }
                }
            }
            System.out.println("Not Found");
        }

        // Time Complexity O(n),Space Complexity O(n)
    }

    public void insert(String value){
        BinaryTreeNode node = new BinaryTreeNode();
        node.value = value;
        if(root == null){
            root = node;
            System.out.println("Initialized Empty Tree");
            return;
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryTreeNode presentNode = queue.remove();
                if(presentNode.left == null){
                    presentNode.left = node;
                    System.out.println("Inserted "+value);
                    break;
                }
                else if(presentNode.right == null){
                    presentNode.right = node;
                    System.out.println("Inserted "+value);
                    break;
                }
                else{
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }

        }

        // Time Complexity O(n),Space Complexity O(n)
    }

    public BinaryTreeNode getDeepestNode(){
        if(root == null){
            System.out.println("Empty Tree");
            return null;
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
            BinaryTreeNode presentNode=null;
            while(!queue.isEmpty()){
                presentNode = queue.remove();
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
            return presentNode;
        }

        // Time Complexity O(n),Space Complexity O(n)
    }


    public void deleteDeepestNode(){
        if(root == null){
            System.out.println("Empty Tree");
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
            BinaryTreeNode presentNode=null,previousNode=null;
            while(!queue.isEmpty()){
                previousNode = presentNode;
                presentNode = queue.remove();
                if(presentNode.left == null){
                    previousNode.right = null;
                    return;
                }
                else if(presentNode.right == null){
                    presentNode.left = null;
                    return;
                }
                else{
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }
        }

        // Time Complexity O(n),Space Complexity O(n)
    }

    public void delete(String value){
        if(root == null){
            System.out.println("Empty Tree");
        }
        else{
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryTreeNode presentNode = queue.remove();
                if(presentNode.value.equals(value)){
                    presentNode.value = getDeepestNode().value;
                    deleteDeepestNode();
                    System.out.println("The node is deleted!");
                    return;
                }
                else{
                    if(presentNode.left != null) {
                        queue.add(presentNode.left);
                    }
                    if(presentNode.right != null) {
                        queue.add(presentNode.right);
                    }
                }
            }
            System.out.println("The node does not exists in the binary tree");
        }

        // Time Complexity O(n),Space Complexity O(n)
    }

    public void deleteBinaryTree(){
        root = null;

        // Time Complexity O(1),Space Complexity O(1)
    }
}
