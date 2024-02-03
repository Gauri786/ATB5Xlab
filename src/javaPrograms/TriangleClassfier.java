package src.javaPrograms;

//✅ Triangle Classifier:
//
//Write a program that classifies a triangle based on its side lengths. Given three input values
// representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal),
// or scalene (no sides are equal). Use an if-else statement to classify the triangle.

public class TriangleClassfier {
    public static void main(String[] args){

        int Side1= 5;
        int Side2= 5;
        int Side3= 5;

        if (Side1 == Side2 && Side2 == Side3){
            System.out.println("Equilateral");
        }
        else if (Side1== Side2 || Side2==Side3 || Side3==Side1){
            System.out.println("Triangle is isosceles");
        }
        else {
            System.out.println("scalene");
        }


    }
}
