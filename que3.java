import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 9 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Guessed Number from 1 To 10");
        int i = sc.nextInt();
        if (i == secretNumber) {
            System.out.println("You guessed it right the is number is:" + secretNumber);
        } else {
            System.out.println("You guessed it Wrong the is number is:" + secretNumber);
        }
    }
}
