import java.util.Scanner;

public class IT26101918Lab9Q2 {

    // Java method to calculate and return the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Read the radius value from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call the circleArea() method to calculate the result
        double area = circleArea(radius);

        // Display the result matching the expected output format
        System.out.println("The area of the circle with radius " + radius + " is : " + area);

        // Close the scanner resource
        input.close();
    }
}
