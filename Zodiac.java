package Lab_2;
import java.util.Scanner;
import java.util.HashMap;

public class Zodiac {
    public static void main(String[] args) {
        System.out.println("Question 4.");
        Scanner userInput = new Scanner(System.in);

        //HashMap
        HashMap<Integer, String> zodiacSign = new HashMap<Integer, String>();
        //Populating the HashMap accordingly
        zodiacSign.put(0, "Monkey");
        zodiacSign.put(1, "Rooster");
        zodiacSign.put(2, "Dog");
        zodiacSign.put(3, "Pig");
        zodiacSign.put(4, "Rat");
        zodiacSign.put(5, "Ox");
        zodiacSign.put(6, "Tiger");
        zodiacSign.put(7, "Rabbit");
        zodiacSign.put(8, "Dragon");
        zodiacSign.put(9, "Snake");
        zodiacSign.put(10, "Horse");
        zodiacSign.put(11, "Sheep");

        System.out.print("Enter a year: ");
        int userYear = userInput.nextInt();
        int index = 0;

        for (int key : zodiacSign.keySet()) {
            if (key == (userYear % 12)) {
                index = key;
                break;
            }
        }

        System.out.println("The year is " + zodiacSign.get(index));

        //Closes the scanner after
        userInput.close();
    }
}
