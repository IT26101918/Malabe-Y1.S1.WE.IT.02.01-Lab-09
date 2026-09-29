import java.util.Scanner;

public class IT26101918Lab9Q4 {

    // a) Method to calculate the final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Method to find the grade based on final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Method to print the Name, Final Mark, and Grade of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-12.2f %-5s%n", name, finalMark, grade);
    }

    // d) Main method to handle input and display logic for 5 students
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arrays to store data for 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // Gather input from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            
            System.out.print("Name: ");
            names[i] = input.nextLine();
            
            System.out.print("Assignment Mark (out of 100): ");
            double assignmentMark = input.nextDouble();
            
            System.out.print("Exam Paper Mark (out of 100): ");
            double examMark = input.nextDouble();
            input.nextLine(); // Clear the buffer
            
            // Calculate final mark and determine grade using methods
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            
            System.out.println(); // Empty line for readability
        }

        // Displaying the expected formatted output table
        System.out.printf("%-15s %-12s %-5s%n", "Name", "Final Mark", "Grade");
        System.out.println("---------------------------------------");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        
        input.close();
    }
}
