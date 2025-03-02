import java.util.Scanner;

public class ArmstrongNumberInRange{
    public static boolean isArmstrong(int num){
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
            return true;
        } else {
            return false;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Limit : ");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter the Upper Limit : ");
        int upperLimit = sc.nextInt();
        for(int i=lowerLimit; i<=upperLimit; i++){
            if(isArmstrong(i)){
                System.out.println(i + " is an Armstrong Number");
            } else {
                System.out.println(i + " is not an Armstrong Number");
            }
        }
        sc.close();
    }
}