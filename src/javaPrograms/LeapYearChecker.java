package src.javaPrograms;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024; // Replace with the year you want to check
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
