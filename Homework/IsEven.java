
package Homework;
import java.util.*;

public class IsEven {
    public static void IsEven() {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+"is Even");
        }else{
            System.out.println(a+"is odd");
        }
    }
        
        
    
    public static void main(String[] args) {
       IsEven();
    }
}
