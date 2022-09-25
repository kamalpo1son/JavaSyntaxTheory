package src.ClassAndObject;

public class ClassAndObjects {
    public static void main(String [] args){
       Person person1=new Person();
       Person person2=new Person();
       person1.setAge(12);
       person1.setName("Iqor");
       System.out.println("In main: " + person1.getName());
       System.out.println("In main: " + person1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You have entered wrong name");
        } else {
            name = userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("You have entered wrong age");
        } else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    int calculateYearsToRetirment(){
        int years=65-age;
        return years;
    }

    void speak() {
            System.out.println("My name is " + name);
            System.out.println("I am " + age + " years old");
        }
    void sayHello(){
        System.out.println("Hello!");
    }
}