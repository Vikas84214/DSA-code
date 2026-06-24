package OOPS.CONSTRACTORS.INHERITANCE;

public class inherite {
    public static void main(String arrgs[]){
        Fish shark = new Fish();
        shark.eat();
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
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("the fish is swim in the water");
    }
}


