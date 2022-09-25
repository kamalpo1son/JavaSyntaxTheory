package src.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
         readFile();

    }
    public static void readFile() throws FileNotFoundException {
        File file=new File("test");
        Scanner scanner=new Scanner(file);

    }
}
