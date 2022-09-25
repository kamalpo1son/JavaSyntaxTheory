package src.This;
import java.sql.SQLOutput;
public class This {
    public static void main(String[] args) {
        Human human1=new Human("Bob",17);
        Human human2=new Human("Bob",17);
        Human.description="Nice";
        human1.getAllFields();
        human2.getAllFields();
        Human.description="Bad";
        human1.getAllFields();
        human2.getAllFields();

        Human.printNumberOfPeople();

    }

}
class Human{

    private String name;
    private int age;

    private static int countPeople;

    public static String description;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
        countPeople++;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void  printNumberOfPeople(){
        System.out.println("Count of people is : " + countPeople);
    }

    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name + " " + age);
    }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println(name +","+age + ","+description);
    }

}