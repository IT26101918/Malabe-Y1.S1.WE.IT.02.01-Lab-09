public class IT26101918Lab9Q3 {

    // Method to add two integers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers and return the result
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer by multiplying it by itself
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // Calculation for expression i: (3 * 4 + 5 * 7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int innerSum1 = add(term1, term2);
        int result1 = square(innerSum1);

        // Calculation for expression ii: (4 + 7)^2 + (8 + 3)^2
        int innerSum2_1 = add(4, 7);
        int innerSum2_2 = add(8, 3);
        int square1 = square(innerSum2_1);
        int square2 = square(innerSum2_2);
        int result2 = add(square1, square2);

        // Displaying results in the expected output format
        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2   : " + result2);
    }
}
