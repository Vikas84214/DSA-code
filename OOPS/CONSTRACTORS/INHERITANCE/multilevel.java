package OOPS.CONSTRACTORS.INHERITANCE;

public class multilevel {
    public static void main(String arrgs[]){
        Dog dobby  = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.breed = "thin";
        System.out.println(dobby.legs + dobby.breed);
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
    int legs;
}
class Dog extends Mammals{
    String breed;
}


