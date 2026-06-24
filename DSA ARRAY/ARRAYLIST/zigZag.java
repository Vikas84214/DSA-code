package ARRAYLIST;

import java.util.*;

public class zigZag {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public void addLast(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
}
    static void print(){
        if(head == null){
            System.out.println(" linked is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;

        }
        System.out.println();
    }
    public void zigZagList(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse  2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        Node left = head;
        Node right = prev;
        Node nextL, nextR;


        //alternate merge - zig zag merge
        while(left != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
        }



    }
    public static void main(String args[]){
    zigZag ll = new zigZag();

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);

    print();

    ll.zigZagList();   // ✅ correct method

    print();
    }
}

