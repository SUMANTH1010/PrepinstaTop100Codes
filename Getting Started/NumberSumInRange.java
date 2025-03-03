import java.util.Scanner;

public class NumberSumInRange{
    public static int rangeSum(int lowerLimit, int upperLimit){
        if(lowerLimit > upperLimit){
            return 0;
        } else {
            return lowerLimit + rangeSum(lowerLimit + 1, upperLimit);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit : ");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter the upper limit : ");
        int upperLimit = sc.nextInt();
        int rangeSum = 0;
        for(int i=lowerLimit; i<=upperLimit; i++){
            rangeSum += i;
        }
        System.out.println("Sum of numbers in given range is : " + rangeSum);
        sc.close();
    }
}