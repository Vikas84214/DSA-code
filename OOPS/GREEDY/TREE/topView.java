package OOPS.GREEDY.TREE;

import java.util.*;

public class topView { //O(n^2)

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void top(Node root){
        // level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

        }
        for(int i = min; i<= max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void kLevel(Node root, int level, int k){// O(n)
        if(root == null){
            return;
        }
        if(level ==k){
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);
        //  last common ancester
        int i =0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        // last equal node -> i - th
        Node lca = path1.get(i-1);
        return lca;

        
    }
    public static Node lca2(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
         // leftLca == val & rightLca = null
         if(rightLca == null){
            return leftLca;
         }
         if(leftLca == null){
            return leftLca;
         }

         return root;
    }

    public static void main(String[] args) {
        // Example tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        //System.out.println(diameter(root).diam);
        //System.out.println(height(root)); // Output: 3
        //Node subRoot = new Node(2);
        //subRoot.left = new Node(4);
        //System.out.println(isSubtree(root, subRoot));
        //top(root);
        //int k = 3;
        //kLevel(root, 1, k);
        int n1 = 4, n2 = 6; 
        System.out.println(lca2(root, n1, n2).data);

    }
}