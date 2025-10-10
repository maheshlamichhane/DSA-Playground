import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeWithLinkedList {

    BinaryTreeNode root;

    public BinarySearchTreeWithLinkedList(){
        root = null;
    }

    public BinaryTreeNode insert(BinaryTreeNode currentNode,int value){
        if(currentNode == null){
            BinaryTreeNode node = new BinaryTreeNode();
            node.value = value;
            System.out.println("The value sucessfully inserted");
            return node;
        }
        else if(value <= currentNode.value){
            currentNode.left = insert(currentNode.left,value);
            return currentNode;
        }
        else{
            currentNode.right = insert(currentNode.right,value);
            return currentNode;
        }
    }

    public void insert(int value){
        root = insert(root,value);
        // Time Complexity O(logn),Space complexity O(logn)
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

    public BinaryTreeNode search(int value){
        return search(root,value);
        // Time Complexity O(logn),Space complexity O(logn)
    }


    public static BinaryTreeNode minimumNode(BinaryTreeNode root){
        if(root.left == null){
            return root;
        }
        else{
            return minimumNode(root.left);
        }
    }

    public BinaryTreeNode deleteNode(BinaryTreeNode root,int value){
        if(root == null){
            System.out.println("Tree is empty");
            return null;
        }
        if(value < root.value){
            root.left = deleteNode(root.left,value);
        }
        else if(value > root.value){
            root.right = deleteNode(root.right,value);
        }
        else{
            if(root.left != null && root.right != null){
                BinaryTreeNode temp = root;
                BinaryTreeNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right,minNodeForRight.value);
            }
            else if(root.left != null){
                root = root.left;
            }
            else if(root.right != null){
                root = root.right;
            }
            else{
                root = null;
            }
        }
        return root;
    }

    public BinaryTreeNode deleteNode(int value){
        return deleteNode(root,value);

        // Time Complexity O(logn),Space complexity O(logn)
    }

    public void deleteBinarySearchTree(){
        root = null;

        // Space Complexity O(1),Time Complexity O(1)
    }




}
