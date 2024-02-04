package src.oops_Dec30;

import java.util.Scanner;

public class Lab03_Swap {
    public static void main (String[] args){

        try {
           Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value a");
        int a = sc.nextInt();
        System.out.println("Enter the value b");
        int b=sc.nextInt();
            a=a*b;
            b=a/b;
            a=a/b;

          //  a=a+b;
          //  b=a-b;
          //  a=a-b;

            System.out.println("Value of a " + a);
            System.out.println("Value of b " + b);
        } catch (Exception e){
            System.out.println("not possible");
        }



    }
}
