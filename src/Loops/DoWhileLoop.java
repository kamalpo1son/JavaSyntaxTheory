package src.Loops;

import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter 5 : ");
            value = scanner.nextInt();
        } while (value != 5);

        System.out.println("You entered 5");
    }
}
