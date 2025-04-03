//ADM: 175851

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept the first number from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Accept the second number from the user
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform division and display the result
            double result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            // Handle the case where the second number is zero
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            // Handle other potential exceptions (e.g., invalid input)
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
}