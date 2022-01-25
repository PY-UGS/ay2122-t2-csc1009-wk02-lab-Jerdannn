package Lab_2;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Question 2.");
        Scanner userInput = new Scanner(System.in);
        
        int size = 3;
        float average = 0;
        String numbers = "";
        float[] inputs = new float[size];
        System.out.print("Enter three numbers: ");
        for(int i = 0; i < size; i++) {
            inputs[i] = userInput.nextFloat();
            average += inputs[i];
            numbers += inputs[i] + " ";
        }

        System.out.println("The average of " + numbers + "is " + (average / size));
        //Closes the scanner after
        userInput.close();
    }
}
