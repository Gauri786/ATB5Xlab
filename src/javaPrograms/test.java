package src.javaPrograms;
import java.util.Scanner;

    public class test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine().toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Check if the character is a letter
                if (Character.isLetter(ch)) {
                    // Check if the letter is a vowel
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);

            scanner.close();
        }
    }


