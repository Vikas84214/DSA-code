package OOPS.GREEDY.TREE;
import java.util.*;

public class bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subTree
            root.left = insert(root.left, val);
        }else{
            //right subTree
            root.right = insert(root.right, val);

        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            // case 1 = leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 = single child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            // case 3 = both child
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }
    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;

        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data +" ");
            printInRange(root.right, k1, k2);
        }else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i=0; i<path.size(); i++){
            System.out.print (path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    } 
    public static boolean isValid( Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);

    }
    public static Node createMirror(Node root){//O(n)
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;

        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        /*int values[] = {1, 1, 1};
        //int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        //if(search(root, 6)){
            //System.out.println("key is found");

        //}else{
           // System.out.println("key is not found");
        //}
        //delete(root, 5);
        //System.out.println();
        //inOrder(root);
        //printInRange(root, 5, 12);
        //printRootToLeaf(root, new ArrayList<>());
        if(isValid(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }*/
       Node root = new Node(8);
       root.left = new Node(5);
       root.right = new Node(10);
       root.left.left = new Node(3);
       root.left.right = new Node(6);
       root.right.right = new Node(11);
       root = createMirror(root);
       preorder(root);

    }
    
}
