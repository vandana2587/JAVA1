package praticesesssion1;
import java.util.*;


public class square{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE VALUE OF M");
       int m=sc.nextInt();
       System.out.println("ENTER THE VALUE OF N");
       int n=sc.nextInt();
       for (int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}