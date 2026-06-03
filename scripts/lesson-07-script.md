# Script - Lesson 7: Scanner input

## Goal

In this lesson, students will learn how to read information entered by the user through the console using `Scanner`.

The program will ask for a student's name, age and average, then it will show the information and determine whether the student passed or needs more practice.

## What students will learn

- `Scanner` allows Java programs to read information from the console.
- `nextLine()` reads text.
- `nextInt()` reads integer numbers.
- `nextDouble()` reads decimal numbers.
- A program can use entered data to show information and make simple decisions.

## What should NOT be explained

- Do not explain files.
- Do not explain graphical interfaces.
- Do not explain exceptions.
- Do not include advanced validations.
- Do not explain advanced input concepts.

## Starter file

`starter-files/lesson-07-scanner/Main.java`

```java
// Lesson 7: Scanner input
// Complete the TODOs to read student information from the console.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 1: Ask the user to enter the student's name.

        // TODO 2: Read the name using nextLine().

        // TODO 3: Ask the user to enter the student's age.

        // TODO 4: Read the age using nextInt().

        // TODO 5: Ask the user to enter the student's average.

        // TODO 6: Read the average using nextDouble().

        // TODO 7: Print all the student information.

        scanner.close();
    }
}

```
