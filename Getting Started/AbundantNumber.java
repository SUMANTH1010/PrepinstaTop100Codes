import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int factorSum = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                factorSum += i;
            }
        }
        if(factorSum > num){
            System.out.println(num + " is an Abundant Number");
        } else {
            System.out.println(num + " is not an Abundant Number");
        }
        sc.close();
    }
}
