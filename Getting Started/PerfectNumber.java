import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int divisorSum = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                divisorSum += i;
            }
        }
        if(divisorSum == num) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect Number");
        sc.close();
    }
}
