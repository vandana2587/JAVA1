package Homework;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("the the days of year");
        int days=sc.nextInt();
        if(days==366){
            System.out.println("leap year");
        }
        else{
            System.out.println("non leap year");
        }
    }
    
}
