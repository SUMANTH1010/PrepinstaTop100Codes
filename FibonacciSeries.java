import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        int n = sc.nextInt();
        int firstTerm = 0, secondTerm = 1, nextTerm;
        System.out.print(firstTerm + " , " + secondTerm + " , ");
        for(int i=2; i<n; i++){
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(nextTerm + " , ");
        }
        sc.close();
    }
}
