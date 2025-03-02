import java.util.Scanner;

public class PrimeNumbersInRange {
    public static boolean isPrime(int num){
        int factorCount = 0;
        if(num<=1){
            return false;
        } else{
            for(int i=1; i<=num; i++){
                if(num%i == 0){
                    factorCount += 1;
                }
            }
        }
        return (factorCount == 2) ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Limit : ");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter the Upper Limit : ");
        int upperLimit = sc.nextInt();
        for(int i=lowerLimit; i<=upperLimit; i++){
            if(isPrime(i)){
                System.out.println(i + " is a Prime Number in Given Range");
            }
        }
        sc.close();
    }
}
