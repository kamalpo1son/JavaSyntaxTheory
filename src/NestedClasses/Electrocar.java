package src.NestedClasses;

public class Electrocar {
    private int id;

    //вложенные нестатические классы
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" +id+ " is starting!");
        }
    }

    //вложенные статические классы
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging!");
        }
    }
    public Electrocar(int id){
        this.id=id;
    }
    public void start(){
        Motor motor=new Motor();
        motor.startMotor();

        final int x=1;

        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass=new SomeClass();
        test(someClass);
        System.out.println("Electrocar" + id + " is starting!");
    }
    private void test(Object object){

    }
}
