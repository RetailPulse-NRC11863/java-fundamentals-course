// Lesson 7: Scanner input
// Completed example.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the student's average: ");
        double average = scanner.nextDouble();

        System.out.println("--- Student information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average: " + average);

        if (average >= 13) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}