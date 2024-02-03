package src.dec17;

import java.util.Scanner;

public class lab056 {

    public static void main(String[] args){

        // condition base - If,Switch
        //Loop - which will repeat something - for, while, do while

        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter the number 1-7, i will tell you the day");
        int dayNumber = sc.nextInt();


        switch (dayNumber){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Are you mad");




        }

    }
}
