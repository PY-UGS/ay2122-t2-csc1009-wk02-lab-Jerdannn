import java.util.Scanner; //Imports the Scanner class
import java.util.HashMap; //Imports the HashMap class

public class LabTwo {
    public static final double PI = 3.14159; //A constant variable
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creates a scanner

        System.out.println("Question 1");
        System.out.print("Enter a radius: ");
        double userRadius = input.nextDouble();
        System.out.println("The area for the circle of radius " + userRadius + 
        " is " + (userRadius * userRadius * PI));
        System.out.print("\n");

        System.out.println("Question 2");
        System.out.print("Enter three numbers: ");
        float numOne = input.nextFloat();
        float numTwo = input.nextFloat();
        float numThree = input.nextFloat();
        System.out.println("The average of " + numOne + " " + numTwo + " " +
        numThree + " is " + ((numOne + numTwo + numThree) / 3));
        System.out.print("\n");

        System.out.println("Question 3");
        //Seconds
        long milliSec = System.currentTimeMillis();
        long totalSec = milliSec / 1000;
        long currentSec = totalSec % 60;
        //Minutes
        long totalMin = totalSec / 60;
        long currentMin = totalMin % 60;
        //Hours
        long totalHr = totalMin / 60;
        long currentHr = totalHr % 24;
        System.out.println("Current time is " + currentHr + ":" +
        currentMin + ":" + currentSec + " GMT");
        System.out.print("\n");

        System.out.println("Question 4");
        //Creates a HashMap for the 12 Zodiac Signs
        HashMap<Integer, String> zodiacSign = new HashMap<Integer, String>();
        //Add keys and values (Number, Sign)
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
        int userYear = input.nextInt();
        int userKey = 0;
        userYear %= 12; //Gets the corresponding key
        for(Integer key : zodiacSign.keySet()) { //Loops through all keys of the HashMap
            if (userYear == key) {
                userKey = key;
            }
        }
        System.out.println("The zodiac sign is " + zodiacSign.get(userKey));
        input.close(); //Closes the scanner after it's done
    }
}
