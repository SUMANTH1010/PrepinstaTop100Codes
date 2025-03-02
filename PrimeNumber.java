import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int factorCount = 0;
        if(num <= 1){
            System.out.println("Number is not prime");
        }
        else{
            for(int i=1; i<=num; i++){
                if(num%i == 0){
                    factorCount += 1;
                }
            }
        }
        if(factorCount == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}
