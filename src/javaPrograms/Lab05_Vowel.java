package src.javaPrograms;

import java.util.Scanner;

public class Lab05_Vowel {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the String- ");
        String input = scanner.nextLine().toLowerCase();

        int vowelCount= 0;
        int consonantCount= 0;

        for( int i= 0; i<input.length(); i++){
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
                System.out.println("number of vowel " + vowelCount);
                System.out.println("number of consonant " + consonantCount);
                scanner.close();
            }
        }


    }


}
