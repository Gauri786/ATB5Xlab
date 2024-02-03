package src.dec23;

import java.util.Scanner;

public class lab23_02 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name");
        String name = sc.next();
        System.out.print("Enter mobile number");
        double Mobile_No= sc.nextDouble();
        System.out.print("Enter the ID");
        int id= sc.nextInt();
        System.out.print("Enter 10th Percentage");
        float Board_Percentage = sc.nextFloat();

        System.out.print("View your all detail" + name +Mobile_No + id +Board_Percentage);

        sc.close();
    }
}
