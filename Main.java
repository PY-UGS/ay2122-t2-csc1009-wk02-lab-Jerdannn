package CSC1009_Lab.Lab_2;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    // Constants
    static final int SIZE = 3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Question 1:");
        System.out.print("Enter a number for the radius: ");
        double userRad = input.nextDouble();
        Circle c = new Circle(userRad);
        System.out.println("The area for the circle of radius "
        + c.getRadius() + " is " + c.getArea());

        System.out.println("Question 2:");
        System.out.print("Enter " + SIZE + " numbers: ");
        double temp = 0;
        String s = "";
        for (int i = 0; i < SIZE; i++) {
            double userNum = input.nextDouble();
            s += userNum + " ";
            temp += userNum;
        }
        System.out.println("The average of " + s + "is " + temp/SIZE);

        System.out.println("Question 3:");
        // Typecasting in Java is slightly different
        // note: (int)xxx instead of int(xxx)
        double totalMilli = System.currentTimeMillis();
        double totalSec = totalMilli / 1000;
        int currentSec = (int)totalSec % 60;
        double totalMin = totalSec / 60;
        int currentMin = (int)totalMin % 60;
        double totalHour = totalMin / 60;
        int currentHour = (int)totalHour % 24;
        System.out.println("Current time is " + currentHour + ":" +
        currentMin + ":" + currentSec + " GMT");

        System.out.println("Question 4:");
        // A HashMap is a list that takes in a 
        // key-value pair
        HashMap<Integer, String> zodiac = new HashMap<Integer, String>();
        zodiac.put(0, "Monkey");
        zodiac.put(1, "Rooster");
        zodiac.put(2, "Dog");
        zodiac.put(3, "Pig");
        zodiac.put(4, "Rat");
        zodiac.put(5, "Ox");
        zodiac.put(6, "Tiger");
        zodiac.put(7, "Rabbit");
        zodiac.put(8, "Dragon");
        zodiac.put(9, "Snake");
        zodiac.put(10, "Horse");
        zodiac.put(11, "Sheep");
        System.out.print("Enter a year: ");
        int userYear = input.nextInt();
        int referenceYear = userYear % 12;
        int temp2 = 0;
        // Iterating through a HashMap's keys
        // note: .values() is used to iterate through the values
        for (Integer key : zodiac.keySet()) {
            if (referenceYear == key) {
                temp2 = key;
            }
        }
        // HashMap's 'get()' function allows you to
        // retrieve a value using a key
        System.out.println(zodiac.get(temp2));

        input.close();
    }
}
