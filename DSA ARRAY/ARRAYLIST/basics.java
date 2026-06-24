package  ARRAYLIST;
import java.util.LinkedList;

public class basics {
    //linked list fundamental
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
         //create new node 
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //newnode next= head
        newNode.next = head;
        // head = newNode
        head = newNode;
    }
    //add linked list data at end
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //print linked list
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
    //add data in linked list middle
    public void addMiddle(int idx, int data){
        Node newNode = new Node(data);
        size++;
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int remFirst(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    //iterative search-O(n)
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
    //Reursive search-O(n)
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);

    }
    //Reverse of linked list-O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
    // find& Remove nth node from End-O(n)
    public void deleteNthfromEnd(int n){
 // calculate size of the array
    int sz = 0;
    Node temp = head;
    while(temp != null){
        temp = temp.next;
        sz++;
    }
    if(n == sz){
        head = temp.next;
        return;
    }
    //sz-n
    int i = 1;
    int iToFind = sz-1;
    Node prev = head;
    while(i< iToFind){
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;

    }
    // slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }

    public boolean checkPalindrome(){
        // step1 - find mid
        if(head == null || head.next == null){
            return true;
        }
        // step2 - reverse secound half
        Node midNode = findMid(head);
        
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
        //step3 - check left half and right half for palindrome
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
    /*basics ll = new basics();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(2);
        ll.print();
        //ll.addLast(1);
        //ll.print();
        /*ll.addMiddle(2, 3);
        ll.print();
        ll.addMiddle(3, 7);
        ll.print();
        System.out.println("size of linked list is = " + ll.size);
        ll.remFirst();
        ll.print();
        ll.remFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("size of linked list is = " + ll.size);
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());*/
    }
 }
