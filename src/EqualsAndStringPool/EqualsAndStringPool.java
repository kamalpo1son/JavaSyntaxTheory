package src.EqualsAndStringPool;

public class EqualsAndStringPool {
    public static void main(String[] args) {
        String string1="Hello";
        String string2="Hello";

        System.out.println(string1.equals(string2));
    }
}

class Animal{
    private int id;

    public Animal(int id){
        this.id=id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal=(Animal)obj;
        return this.id==id;
    }
}
