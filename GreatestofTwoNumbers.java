import java.util.Scanner;

public class GreatestofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("Largest number is : " + largest);
        sc.close();
    }
}
