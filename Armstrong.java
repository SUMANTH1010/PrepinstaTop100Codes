import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int digitCount = 0;
        int digitSum = 0;
        while(num != 0){
            num = num / 10;
            digitCount++;
        }
        num = temp;
        while(num != 0){
            int remainder = num % 10;
            digitSum += Math.pow(remainder, digitCount);
            num = num / 10;
        }
        if(digitSum == temp){
            System.out.println("Given number is an Armstrong Number");
        } else {
            System.out.println("Given number is not an Armstrong Number");
        }
        sc.close();
    }
}
