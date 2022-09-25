package src.MultidimensionalArrays;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MultidimensionalArrays {
    public static void main(String [] args){
        int[] number={1,2,3};
        Scanner input=new Scanner(System.in);
        System.out.println(number[1]);
        int[][] numbers=new int[2][2];
        String[][] strings=new String[2][3];
        strings[0][1]="HELLO!";
        System.out.println(strings[0][1]);
        System.out.println("Enter the elements of massive :");
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                numbers[i][j]=input.nextInt();
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(numbers[i][j]+" ");
            }
        }

        }
    }
