import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt(), reverseNum = 0;
        while(num != 0){
            reverseNum = reverseNum*10 + (num%10);
            num = num/10;
        }
        System.out.println("Reverse of given number is : " + reverseNum);
        sc.close();
    }
}
