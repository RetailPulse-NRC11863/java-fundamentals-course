// Lesson 6: Methods and parameters
// Completed example.

public class Main {
    public static void showStudent(String name, int age, double average) {
        System.out.println("--- Student information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average: " + average);
    }

    public static boolean hasPassed(double average) {
        return average >= 13;
    }

    public static void main(String[] args) {
        String name = "Ana";
        int age = 15;
        double average = 17.5;

        showStudent(name, age, average);

        boolean passed = hasPassed(average);
        System.out.println("Passed: " + passed);
    }
}

