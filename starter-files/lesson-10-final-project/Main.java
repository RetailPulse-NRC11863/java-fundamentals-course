// Lesson 10: Final project
// Complete the TODOs to build a simple student registry.

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
        // TODO 1: Create an array of 3 students.

        // TODO 2: Add 3 Student objects to the array.

        // TODO 3: Print all students using a for loop.

        // TODO 4: Print if each student passed or needs more practice.

        // TODO 5: Calculate the classroom average.

        // TODO 6: Find and print the student with the highest average.

    }
}

