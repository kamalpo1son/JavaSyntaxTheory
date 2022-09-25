package src.Inheritance;
public class Nasledstvo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        animal.sleep();
        Dog dog=new Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
    }
}
 class Animal{

    String name;
    public void eat(){
        System.out.println("Im eating!");
    }
    public void sleep(){
        System.out.println("Im sleeping!");
    }
}
 class Dog extends Animal{
    public void bark(){
        System.out.println("*Barking*");
    }
    public void eat(){
        System.out.println("Dog is eating!!");
    }
    public void sleep(){
        System.out.println("Dog is sleeping!");
    }
    public void showName(){
        System.out.println(name);
    }
 }