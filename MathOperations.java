public class MathOperations {
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Multiply 2 numbers: " + math.multiply(5, 10));
        System.out.println("Multiply 3 numbers: " + math.multiply(5, 10, 2));
    }
}
