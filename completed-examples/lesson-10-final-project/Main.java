// Lesson 10: Final project
// Completed example.

class Student {
    private String name;
    private int age;
    private double average;

    Student(String name, int age, double average) {
        this.name = name;
        this.age = age;
        setAverage(average);
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getAverage() {
        return average;
    }

    void setAverage(double average) {
        if (average >= 0 && average <= 20) {
            this.average = average;
        } else {
            System.out.println("Invalid average. It must be between 0 and 20.");
        }
    }

    void showInfo() {
        System.out.println("Name: " + getName() + " | Age: " + getAge() + " | Average: " + getAverage());
    }

    boolean hasPassed() {
        return average >= 13;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Ana", 15, 17.5);
        students[1] = new Student("Luis", 16, 12.8);
        students[2] = new Student("Maria", 15, 18.2);

        System.out.println("=== Student Registry ===");

        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();

            if (students[i].hasPassed()) {
                System.out.println("Status: Passed");
            } else {
                System.out.println("Status: Needs more practice");
            }

            System.out.println();
        }

        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverage();
        }

        double classroomAverage = sum / students.length;

        System.out.println("Classroom average: " + classroomAverage);

        Student bestStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > bestStudent.getAverage()) {
                bestStudent = students[i];
            }
        }

        System.out.println("Best student: " + bestStudent.getName() + " with " + bestStudent.getAverage());
    }
}

