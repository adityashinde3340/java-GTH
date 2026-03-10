/*
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). 
Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.

*/
class Student {
    private int rollNo;
    private String name;
    private int[] marks = new int[3];

    // Constructor
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    // Calculate total marks
    public int getTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Calculate average marks
    public double getAverage() {
        return getTotal() / 3.0;
    }

    // Check fail condition
    public boolean isFailed() {
        for (int m : marks) {
            if (m < 35)
                return true;
        }
        return false;
    }
}

public class Q01 {
    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Amit", new int[]{70, 80, 90}),
            new Student(2, "Neha", new int[]{30, 60, 75}),
            new Student(3, "Raj", new int[]{88, 92, 85}),
            new Student(4, "Simran", new int[]{40, 33, 50}),
            new Student(5, "Karan", new int[]{55, 65, 60})
        };

        
        System.out.println("Total Marks:");
        for (Student s : students) {
            System.out.println(s.getName() + " = " + s.getTotal());
        }

       
        Student topper = students[0];
        for (Student s : students) {
            if (s.getAverage() > topper.getAverage()) {
                topper = s;
            }
        }
        System.out.println("\nHighest Average: " + topper.getName() +
                           " (" + topper.getAverage() + ")");

       
        System.out.println("\nFailed Students:");
        for (Student s : students) {
            if (s.isFailed()) {
                System.out.println(s.getName());
            }
        }
    }
}