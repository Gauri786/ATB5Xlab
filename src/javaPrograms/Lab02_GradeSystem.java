package src.javaPrograms;
//✅ Grade Calculator:
//Write a program that calculates and displays the letter grade for a given numerical
// score (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

import java.util.Scanner;

public class Lab02_GradeSystem {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Score");
        double Score = sc.nextDouble();

        String grade;

        if (Score>=90 && Score<=100) {
            grade = "A";
        }
        else if( Score>=80 && Score<=89){
            grade ="B";
        }
        else if( Score>=70 && Score<=79){
            grade ="C";
        }
        else if( Score>=60 && Score<=69){
            grade ="D";
        }
        else{
            grade ="E";
        }
System.out.println("Your grade  " + grade);
    }
}
