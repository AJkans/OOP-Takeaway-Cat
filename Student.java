public class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Use setter to apply validation
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
            this.grade = 0; // Default to 0 if invalid
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85);
        System.out.println(student1.getName() + "'s grade: " + student1.getGrade());

        student1.setGrade(105); // Invalid grade, should be set to 0
        System.out.println(student1.getName() + "'s updated grade: " + student1.getGrade());
    }
}
