package OOPS.CONSTRACTORS.INHERITANCE.POLYMORPHISM.ABSTRACTION;

public class staticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "JMV";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "MPIC";  
    }  
}
class Student {
    int returnPercentage(int math, int phy, int ches){
        return (math + phy + ches)/3;
    }
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;

    }
    String getName(){
        return this.name;
        
    }
}
