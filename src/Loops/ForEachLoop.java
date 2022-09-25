package src.Loops;
import java.util.Scanner;
public class ForEachLoop {
        public static void main(String [] args){
            Scanner scanner=new Scanner(System.in);
            String[] strings=new String[5];
            System.out.println("Enter the array of strings");
            int i=0;
            for(i=0;i<strings.length;i++){
                strings[i]=scanner.nextLine();
            }
            System.out.println("What we have input there : ");
            for(String x:strings){
                System.out.println(x);
            }
            int[] numbers1={1,2,3};
            int sum=0;

            for(int x:numbers1){
                sum=sum+x;
            }
            System.out.println(sum);
        }
    }
