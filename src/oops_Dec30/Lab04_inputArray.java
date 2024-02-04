package src.oops_Dec30;

import java.util.Scanner;

public class Lab04_inputArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int [] int_array = new int[n];

        System.out.println("Enter the element");
        for( int i=0 ; i<n ; i++){
           int_array[i]=sc.nextInt();
        }

        System.out.println(" Output " );
        for (int i=0 ; i<n; i++){
            System.out.println(int_array[i]);
        }




    }
}
