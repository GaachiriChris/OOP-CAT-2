public class Student {
    // Private attributes (encapsulation)
    private String name;
    private int grade;

    // Constructor to initialize the Student object
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Use setter to ensure grade is valid
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0; // Set to 0 if grade is invalid
            System.out.println("Invalid grade. Grade set to 0.");
        }
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Chris", 60);

        // Access and modify the attributes using getters and setters
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Grade: " + student1.getGrade());

        student1.setGrade(95);
        System.out.println("Updated Grade: " + student1.getGrade());

        student1.setGrade(110); // This will print the error message and set grade to 0
        System.out.println("Invalid Grade: " + student1.getGrade());
    }
}
