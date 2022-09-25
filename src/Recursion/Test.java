package src.Recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    //counter

    private static int factorial(int n) {
        if(n==1)
            return 1;

        return n*factorial(n-1);

    }
}
