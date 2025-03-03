import java.util.Scanner;

public class GreatestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3 : ");
        int num3 = sc.nextInt();
        int greatest = (num1 > num2 && num1 > num3) ? num1 : 
                        (num2 > num1 && num2 > num3) ? num2 : num3;
        System.out.println("Greatest of three given numbers is : " + greatest);
        sc.close();
    }
}
