import java.util.Scanner;

public class FriendlyPair {
    public static int factorSum(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        if(factorSum(num2)/num2 == factorSum(num1)/num1){
            System.out.println("Given numbers are a Friendly Pair");
        } else{
            System.out.println("Given numbers are not a Friendly Pair");
        }
        sc.close();
    }
}
