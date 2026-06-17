// Lesson 9: Encapsulation
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
        System.out.println("--- Student information ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Average: " + getAverage());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ana", 15, 17.5);

        student.showInfo();

        System.out.println("Updating average to 18.5...");
        student.setAverage(18.5);
        student.showInfo();

        System.out.println("Trying to update average to 25...");
        student.setAverage(25);
        student.showInfo();
    }
}

