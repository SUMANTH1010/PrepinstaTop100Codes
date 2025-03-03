import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sqRoot = (int)Math.sqrt(num);
        if(Math.floor(sqRoot*sqRoot) == num){
            System.out.println("It is a Perfect Square");
        } else {
            System.out.println("It is not a Perfect Square");
        }
        sc.close();
    }
}
