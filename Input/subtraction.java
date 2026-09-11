package Input;
import java.util.*;

/**
 * subtraction
 */
public class subtraction {
    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        
        int num2=sc.nextInt();
        int diff=num2-num1;
        System.out.println(diff);
    }
    
}
