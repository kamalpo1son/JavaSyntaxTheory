package src.InstanceOfSuper;

public class InstanceOf {
    public static void main(String[] args) {
          Object kate=new Client("Naomi");
          if(kate instanceof Client){
              ((Client)kate).display();
          }
          else{
              System.out.println("Conversion error");
          }
    }
}

class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }

    public void display(){
        System.out.println(name);
    }
}
class Employee extends Person{
    public Employee(String name){
        super(name);
    }
}
class Client extends Person{
    public Client(String name){
        super(name);
    }
}