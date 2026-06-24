package OOPS.QUEUE;

public class circular {
    static int arr[];
    static int size;
    static int rear;
    static int front;
    circular(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }
    public static boolean isEmpty(){
        return rear ==-1 && front == -1;
    }
    public static boolean isFull(){
        return (rear+1)%size == front;
    }
    // add function tc = O(1)
    public static void add(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }
    //remove function  tc = O(n)
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        int result = arr[front];
        front = (front + 1) % size;
        // last element add
        if(rear == front){
            rear = front = -1;
        }else{
            front = (front + 1) % size;
        }
        return result;
    }
    // peak function
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
    }
    public static void main(String args[]){
        basics q = new basics(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }
    
}


    
