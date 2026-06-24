import java.util.*;
public class input {
    public static void main(String args[]){
        int marks[] = new int[45];
        Scanner sc = new Scanner(System.in);
        //int physics;
        //physics = sc.nextInt();
        //int chemestry = sc.nextInt();
        //int biology = sc.nextInt();
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("physics ="+marks[0]);
        System.out.println("chemestry ="+marks[1]);
        System.out.println("biology ="+marks[2]);
        System.out.println("length of array = " + marks.length);

        marks[2] = 100;
        marks[1] = marks[1] + 1;
        System.out.println("biology :" + marks[2]);

    }
    
}
