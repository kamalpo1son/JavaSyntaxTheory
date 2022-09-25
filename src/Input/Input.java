package src.Input;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x = s.nextInt();
        System.out.println("You entered : " + x);
    }
}
