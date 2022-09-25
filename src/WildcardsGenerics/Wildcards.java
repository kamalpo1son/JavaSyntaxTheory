package src.WildcardsGenerics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animal> ListOfAnimal = new ArrayList<>();
        ListOfAnimal.add(new Animal(0));
        ListOfAnimal.add(new Animal(1));

        List<Dog> ListOfDogs = new ArrayList<>();
        ListOfDogs.add(new Dog(2));
        ListOfDogs.add(new Dog(3));

        test(ListOfAnimal);
        System.out.println();
        test(ListOfDogs);
    }

    private static void test(List<? extends Animal> pon){
        for(Animal animal:pon){
            System.out.print(animal + " ");
            animal.eat();
        }
    }
}
