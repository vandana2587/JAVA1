package Datatypes;
import java.util.*;

public class pricing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price of pen");
        float pen=sc.nextInt();
        
        System.out.println("enter the price of pencil");
        float pencil=sc.nextInt();
        
        System.out.println("enter the price of erasser");
        float eraser=sc.nextInt();
        float sum=(pen+pencil+eraser);
        System.out.println("the total price of all object:"+sum);

    }
    
}
