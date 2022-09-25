package src.Serialization;

import java.io.*;

public class WriteObject {

    public static void main(String[] args) {
         Person[] people={new Person(1,"Bob"),new Person(2,"Mike"),new Person(3,"Donny")};

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("people.bin"))) {
           oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
