package OOPS.CONSTRACTORS.INHERITANCE;

public class hierarichal {
    public static void main(String arrgs[]){
        Bird sparrow = new Bird();
        sparrow.fly();
    } 
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
// derived class or subclass
class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}