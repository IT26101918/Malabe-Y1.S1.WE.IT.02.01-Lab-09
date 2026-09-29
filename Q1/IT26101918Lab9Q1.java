import java.util.Scanner;

public class IT26101918Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        // Calculate the discriminant (b^2 - 4ac) using Math.pow
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Check if roots are real
        if (discriminant >= 0) {
            // Calculate the two roots using Math.sqrt
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("\nRoots are real and different :");
            // Format to 2 decimal places to match the expected output
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else {
            System.out.println("\nRoots are complex and imaginary.");
        }

        input.close();
    }
}
