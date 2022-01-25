package Lab_2;

public class Time {
    public static void main(String[] args) {
        System.out.println("Question 3.");

        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000;
        long currSeconds = totalSeconds % 60;

        long totalMins = totalSeconds / 60;
        long currMins = totalMins % 60;

        long totalHours = totalMins / 60;
        long currHours = totalHours % 24;

        System.out.println("Current time is " + currHours + ":" + currMins + ":" + currSeconds + " GMT");
    }
}
