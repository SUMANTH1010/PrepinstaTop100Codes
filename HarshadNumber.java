import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int digitSum = 0;
        while(temp != 0){
            digitSum += temp%10;
            temp /= 10;
        }
        if(num%digitSum == 0){
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is not a Harshad Number");
        }
        sc.close();
    }
}
