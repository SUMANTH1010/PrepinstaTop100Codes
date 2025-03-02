import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int factorCount = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i + " ");
                factorCount++;
            }
        }
        System.out.println("Number of factors of " + num + " is : " + factorCount);
        sc.close();
    }
}
