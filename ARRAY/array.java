package ARRAY;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
int target=10+24;
        System.out.print("Enter the element: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Index = " + i);
                return;
            }
            System.out.println("target="+target);
        }

        System.out.println("Element not found");
    }
}
