//5. Distance Traveled
//Assuming there are no accidents or delays, the distance that a car travels down the interstate can be calculated with the
//following formula:
//
//Distance = Speed × Time
//
//A car is traveling at 60 miles per hour. Design a Python program that displays the following:
//- The distance the car will travel in 5 hours
//- The distance the car will travel in 8 hours
//- The distance the car will travel in 12 hours
public class DistanceTravelled {
    public static void main(String[] args) {
        final float SPEED = 60.0f;

        System.out.println("The distance the car will travel in 5 hours: " + 5 * SPEED);
        System.out.println("The distance the car will travel in 8 hours: " + 8 * SPEED);
        System.out.println("The distance the car will travel in 12 hours: " + 12 * SPEED);
    }
}
