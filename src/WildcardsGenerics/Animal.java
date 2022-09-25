package src.WildcardsGenerics;

public class Animal {
    private int id;
    public Animal(int id){
        this.id=id;

    }

    public void eat(){
        System.out.println("Im eating!");
    }

    public String toString(){
        return String.valueOf(id);
    }
}
