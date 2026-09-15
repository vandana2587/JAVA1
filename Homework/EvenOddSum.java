package Homework;
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter how many integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        System.out.println("Sum of even integers = " + evenSum);
        System.out.println("Sum of odd integers = " + oddSum);

        sc.close();
    }
}