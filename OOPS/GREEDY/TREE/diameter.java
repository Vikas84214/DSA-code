package OOPS.GREEDY.TREE;

public class diameter { //O(n^2)

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
     public static int daim(Node root){
        if(root == null){
            return 0;
        }
        int leftdiam = daim(root.left);
        int leftheight = height(root.left);
        int rightdaim = daim(root.right);
        int rightheight = height(root.right);
        int selfdiam = leftheight + rightdaim + 1;
        return Math.max(selfdiam, Math.max(leftdiam, rightdaim));
    }

    public static void main(String[] args) {
        // Example tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(daim(root)); // Output: 3
    }
}