package src.ReadingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path="/C:/Users/user/Desktop/Test.txt/";
        File file=new File(path);
        Scanner scanner=new Scanner(file);
        String line=scanner.nextLine();
        String[] numbersString=line.split(" ");
        int[] numbers=new int[3];
        int counter=0;
        for(String number:numbersString){
            numbers[counter++]=Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
