package Lab_2;
import java.util.Scanner;

public class Circle {
    //Static variable
    static final double PI = 3.14159;
    public static void main(String[] args) {
        System.out.println("Question 1.");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = userInput.nextDouble();

        System.out.print("The area for the circle of radius " + radius + " is " + 
        (radius * radius * PI));
        //Close the scanner after
        userInput.close();
    }
}