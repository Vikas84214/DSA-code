package ARRAYLIST;
import java.util.LinkedList;
public class iterativeSearch {
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        iterativeSearch ll = new iterativeSearch();
        head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

        ll.print();

        System.out.println(ll.itrSearch(3));  // Output: 1
        System.out.println(ll.itrSearch(10)); // Output: -1
    }
}
