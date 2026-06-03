// Lesson 8: Classes, objects and constructors
// Completed example.

class Student {
    String name;
    int age;
    double average;

    Student(String name, int age, double average) {
        this.name = name;
        this.age = age;
        this.average = average;
    }

    void showInfo() {
        System.out.println("--- Student information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average: " + average);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ana", 15, 17.5);
        student1.showInfo();

        Student student2 = new Student("Luis", 16, 12.8);
        student2.showInfo();
    }
}

