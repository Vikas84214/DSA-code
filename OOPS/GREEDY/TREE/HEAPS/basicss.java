package OOPS.GREEDY.TREE.HEAPS;
import java.util.*;

public class basicss {
    //FOR OBJECT STORING
    static class Student implements Comparable<Student>{  //overriding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;

        }
        @Override
        public int compareTo(Student s2){
            return this.rank -s2.rank;
        }
    }
    public static void main(String args[]){
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        pq.add(new Student("A",4)); //O(logn)
        pq.add(new Student("B",5));
        pq.add(new Student("C",1));
        pq.add(new Student("D",12));

        ////while(!pq.isEmpty()){
            //System.out.print(pq.peek()); //O(1) 
            //pq.remove(); //O(logn)
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}