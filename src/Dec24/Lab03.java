package src.Dec24;

import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the First subject marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the Second subject marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Third subject marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Fouth subject marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Five subject marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<30) {
                System.out.println("You are unluck >>");
            }

                System.out.println(marks[i]);
            }


        }

    }
