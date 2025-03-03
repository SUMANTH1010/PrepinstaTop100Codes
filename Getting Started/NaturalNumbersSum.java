import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First N natural numbers => n = 1 to user input
        // Sum of N natural numbers => n = 0 to user input
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        int numberSum = 0;
        for(int i=1; i<n; i++){
            numberSum += i;
        }
        System.out.println("Sum of First N Natural Numbers : " + numberSum);
        sc.close();
    }
}
