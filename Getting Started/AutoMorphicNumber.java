import java.util.Scanner;

public class AutoMorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int squareNum = num*num;
        if((squareNum%10) == (num%10)){
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
        sc.close();
    }
}
