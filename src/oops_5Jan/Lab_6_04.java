package src.oops_5Jan;

import java.util.Scanner;

public class Lab_6_04 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character, i'll check for palindrome");
        String user_Input= sc.next();
        boolean result = isPalindrome(user_Input);
        if (result){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
        
        
        
    }

    private static boolean isPalindrome(String userInput) {
        String original_input = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        return original_input.equalsIgnoreCase(sb.toString());
    }
}
