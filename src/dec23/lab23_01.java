package src.dec23;

import java.util.Scanner;

public class lab23_01 {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter x value");
        double x= sc.nextDouble();
        System.out.println("Enter y value");
        double y= sc.nextDouble();
        System.out.println("Enter z value");
        double z= sc.nextDouble();

        //sc.nextInt()
        //sc.nextDouble();
        //sc.nextBoolean();
        //sc.nextFloat();
        //sc.next() for string

        double result=0;

        // 3/x^2+y^2-|z|


        result= Math.cbrt (Math.pow(x,2)+ Math.pow(y,2)-Math.abs(z));
System.out.println(result);
        sc.close();

    }
}
