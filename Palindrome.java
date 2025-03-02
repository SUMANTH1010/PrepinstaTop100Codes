import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int reverseNum = 0;
        while(num != 0){
            reverseNum = reverseNum*10 + num%10;
            num = num /10;
        }
        if(reverseNum == num){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Given number is a Palindrome");
        } else {
            System.out.println("Given number is not a Palindrome");
        }
        sc.close();
    }
}
