// Base class: Person
class Person {
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Student (inherits from Person)
class Student extends Person {
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000;

    // Constructor to initialize student details
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call parent constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate fees
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Override displayInfo() to show student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display name and age from Person
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: $" + calculateFees());
    }
}

// Subclass: Instructor (inherits from Person)
class Instructor extends Person {
    private String employeeID;
    private String department;
    private double salary;

    // Constructor to initialize instructor details
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call parent constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo() to show instructor details @Override
    public void displayInfo() {
        super.displayInfo(); // Display name and age from Person
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Demonstration class
public class UniversityEnrollment {
    // Polymorphic method that accepts a Person and calls displayInfo()
    public static void printDetails(Person p) {
        p.displayInfo();
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Mitsiko Bella G. Registrado", 19, "231001306", "Computer Engineering", 25);
        Student student2 = new Student("Diana Abellar O. Abellar", 19, "231002310", "Computer Engineering", 25);
        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Tanya Jovillano ", 22, "I101", "Enginer", 60000);
        Instructor instructor2 = new Instructor("Engr. Eric Velitario", 30, "I101", "Enginer", 70000);

        // Use the polymorphic method to print details
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}


                                                                                                                                                                                  
