import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int n){
        if(n <= 1) return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int digitFactorialSum = 0;
        while(num != 0){
            digitFactorialSum += factorial((num%10));
            num /= 10;
        }
        if(digitFactorialSum == temp)
            System.out.println("Given number is a Strong number");
        else
            System.out.println("Given number is not  Strong number");
        sc.close();
    }
}
