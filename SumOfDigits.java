import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int digitSum = 0;
        while(num != 0){
            digitSum += (num%10);
            num /= 10;
        }
        System.out.println("Sum of digits of given number : " + digitSum);
        sc.close();
    }
}
