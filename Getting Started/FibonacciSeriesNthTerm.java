import java.util.Scanner;

public class FibonacciSeriesNthTerm {
    public static int fibN(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        else return fibN(n - 1) + fibN(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        System.out.println(n + "th term in the Fibonacci series is : " + fibN(n));
        sc.close();
    }
}
