import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int fact= 1;
        for(int i=0; i<=n; i++){
            if(i == 0 || i == 1){
                fact = fact * 1;
            } else {
                fact *= i;
            }
        }
        System.out.println("Factorial of " + n + " is : " + fact);
        sc.close();
    }
}
