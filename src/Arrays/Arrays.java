package src.Arrays;

import java.util.Scanner;
public class Arrays {
    public static void main(String [] args){
        int[] numbers = new int[5];
        Scanner scanner= new Scanner(System.in);
        for(int i=0; i<numbers.length;i++){
            System.out.println("Enter the "+i +"1th element of massive : ");
            numbers[i]= scanner.nextInt();
        }
        System.out.println("Your elements : \n");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
