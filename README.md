# OOP CAT 2
 CAT 2 submission
 
# Student.java README

## Description

This Java code defines a `Student` class that represents a student with a name and a grade. The code demonstrates object-oriented programming (OOP) principles, specifically encapsulation, and includes a `main` method for demonstration.

## Code Explanation

### Class: `Student`

* **Encapsulation:**

    * The `Student` class encapsulates the student's data (name and grade) using private attributes:

        * `private String name`: Stores the student's name.

        * `private int grade`: Stores the student's grade.

    * Encapsulation is achieved by making these attributes `private`, meaning they can only be accessed from within the `Student` class itself. This protects the data from direct, uncontrolled modification.

* **Constructor:**

    * `public Student(String name, int grade)`: This is the constructor of the `Student` class. It is used to create `Student` objects.

        * It takes the student's name and grade as input.

        * It initializes the `name` attribute directly.

        * It calls the `setGrade(grade)` method to set the grade, ensuring that the grade is valid.

* **Getter Methods (Accessors):**

    * `public String getName()`: Returns the student's name.

    * `public int getGrade()`: Returns the student's grade.

    * These methods provide read-only access to the `name` and `grade` attributes.

* **Setter Method (Mutator):**

    * `public void setGrade(int grade)`: Sets the student's grade.

        * It takes the new grade as input.

        * **Validation:** It checks if the provided `grade` is within the valid range (0 to 100).

            * If the grade is valid, it sets the `grade` attribute.

            * If the grade is invalid, it prints an error message ("Invalid grade. Grade set to 0.") and sets the `grade` attribute to 0. This ensures data integrity.

    * `public void setName(String name)`: Sets the student's name.

* **`main` Method:**

    * `public static void main(String[] args)`: This is the entry point of the Java program. It demonstrates how to use the `Student` class.

        1.  **Create a Student Object:**

            * `Student student1 = new Student("Alice", 85);`

            * This line creates a new `Student` object named `student1` with the name "Alice" and a grade of 85.

        2.  **Access Attributes using Getters:**

            * `System.out.println("Student Name: " + student1.getName());`

            * `System.out.println("Student Grade: " + student1.getGrade());`

            * These lines use the `getName()` and `getGrade()` methods to retrieve and print the student's name and grade.

        3.  **Modify Attribute using Setter:**

            * `student1.setGrade(95);`

            * `System.out.println("Updated Grade: " + student1.getGrade());`

            * These lines use the `setGrade()` method to change the student's grade to 95, and then print the updated grade.

        4.  **Demonstrate Invalid Grade Handling:**

            * `student1.setGrade(110);`

            * `System.out.println("Invalid Grade: " + student1.getGrade());`

            * These lines attempt to set the grade to 110, which is invalid. The `setGrade()` method will print an error message, and the grade will be set to 0. The code then prints the (invalid) grade to demonstrate the error handling.

## How to Compile and Run

1.  **Prerequisites:**

    * Java Development Kit (JDK) installed on your system.
    * A terminal or command prompt.

2.  **Save the code:** Save the Java code as `Student.java`.

3.  **Compile:** Open a terminal or command prompt and navigate to the directory where you saved `Student.java`. Compile the code using the Java compiler:

    ```bash
    javac Student.java
    ```

    This will create a file named `Student.class`, which contains the compiled bytecode.

4.  **Run:** Run the compiled Java program using the Java Virtual Machine (JVM):

    ```bash
    java Student
    ```

    This will execute the `main` method in the `Student` class, and you will see the output printed to the console.
