package src.ArraysOfStrings;

import java.util.Scanner;
public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings=new String[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the elements of string massive: ");
        for(String string:strings){
            string=scanner.nextLine();
        }
    }
}
