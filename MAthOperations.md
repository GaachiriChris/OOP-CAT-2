# MathOperations.java README

## Description

This Java code defines a class `MathOperations` that demonstrates method overloading.  The class provides two methods named `multiply`:

* One method multiplies two integers.
* The other method multiplies three integers.

Java uses the number of parameters to differentiate between these methods.

## Code Explanation

### Class: `MathOperations`

* **Method Overloading:** The `MathOperations` class contains two methods with the same name (`multiply`) but different signatures:
    * `public int multiply(int a, int b)`: Takes two integer arguments and returns their product.
    * `public int multiply(int a, int b, int c)`: Takes three integer arguments and returns their product.
* **`main` Method:**
    * The `main` method creates an instance of the `MathOperations` class and calls both `multiply` methods to demonstrate how they are used.  The output shows the result of each multiplication.

## How to Compile and Run

1.  **Save the code:** Save the Java code as `MathOperations.java`.
2.  **Compile:** Open a terminal or command prompt and navigate to the directory where you saved `MathOperations.java`.  Compile the code using the Java compiler:

    ```bash
    javac MathOperations.java
    ```

3.  **Run:** Run the compiled Java program:

    ```bash
    java MathOperations
    ```
