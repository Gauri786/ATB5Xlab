package src.oops_Dec30;

import java.util.Scanner;

public class Lab02_Swap {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a");
        int a = sc.nextInt();
        System.out.println("Enter the value b");
        int b = sc.nextInt();


        int temp=a;
        a= b;
        b= temp;

        System.out.println( "value of a "   + a );
        System.out.println( "value of b "  + b);
    }

}
