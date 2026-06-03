# Script - Lesson 7: Scanner Input

## Goal

In this lesson, students will learn how to read information entered by the user through the console using `Scanner`.

The program will ask for a student's name, age and average. Then, it will show the information and determine whether the student passed or needs more practice.

---

## What students will learn

- `Scanner` allows Java programs to read information from the console.
- `nextLine()` reads text.
- `nextInt()` reads integer numbers.
- `nextDouble()` reads decimal numbers.
- A program can use entered data to show information and make simple decisions.

---

## What should NOT be explained

- Do not explain files.
- Do not explain graphical interfaces.
- Do not explain exceptions.
- Do not include advanced validations.
- Do not explain advanced input concepts.

---

## Starter file

Path:

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

---

## Completed example

Path:

`completed-examples/lesson-07-scanner/Main.java`

```java
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
```

---

# Recording script

## Introduction

Hello, welcome to lesson 7 of the Java course.

In this lesson, we are going to make our program more interactive. Until now, we usually wrote the data directly in the code, like a student's name, age or average.

Now, we are going to make the user enter that information from the console.

To do that, we will use a Java tool called `Scanner`.

---

## What Scanner does

`Scanner` lets us read information typed by the user while the program is running.

For example, we can ask for the student's name, age and average.

Then, we store that information in variables and use it to show a result.

In this program, we will ask for student data and then show if the student passed or needs more practice.

---

## Initial code

On the screen, we already have the starter file.

First, we have this line:

```java
import java.util.Scanner;
```

This allows us to use `Scanner`.

Then, we have this line:

```java
Scanner scanner = new Scanner(System.in);
```

This creates a `scanner` object that will read what the user types in the console.

---

## Ask and read the name

First, we ask for the student's name.

Write:

```java
System.out.print("Enter the student's name: ");
```

This message tells the user what to type.

Now, we read the name.

Write:

```java
String name = scanner.nextLine();
```

Here, we store the text entered by the user in a variable called `name`.

We use `String` because the name is text, and we use `nextLine()` because it reads text from the console.

---

## Ask and read the age

Now, we ask for the age.

Write:

```java
System.out.print("Enter the student's age: ");
```

Now, we read the age.

Write:

```java
int age = scanner.nextInt();
```

The age is stored in a variable called `age`.

We use `int` because age is a whole number, and we use `nextInt()` to read integer numbers.

---

## Ask and read the average

Now, we ask for the student's average.

Write:

```java
System.out.print("Enter the student's average: ");
```

Now, we read the average.

Write:

```java
double average = scanner.nextDouble();
```

The average can have decimals, like `17.5` or `12.8`, so we use `double`.

We use `nextDouble()` to read decimal numbers.

---

## Show the information

Now that we have the data, we show it in an organized way.

Write:

```java
System.out.println("--- Student information ---");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Average: " + average);
```

The `+` symbol lets us combine text with the value of a variable.

---

## Add a condition

Now, we make the program decide if the student passed.

Write:

```java
if (average >= 13) {
    System.out.println("Status: Passed");
} else {
    System.out.println("Status: Needs more practice");
}
```

If the average is greater than or equal to `13`, the program prints `Status: Passed`.

Otherwise, it prints `Status: Needs more practice`.

---

## Close Scanner

At the end, we leave this line:

```java
scanner.close();
```

This closes the scanner when we finish using it.

---

## First test

Now, run the program.

Use these values:

```text
Ana
15
17.5
```

Since the average is `17.5`, the student passed.

Expected result:

```text
Enter the student's name: Ana
Enter the student's age: 15
Enter the student's average: 17.5
--- Student information ---
Name: Ana
Age: 15
Average: 17.5
Status: Passed
```

---

## Mini challenge

Now, try another example.

Use:

```text
Luis
16
10.5
```

Because the average is lower than `13`, the program should show:

```text
Status: Needs more practice
```

---

## Closing

In this lesson, you learned how to read data from the console using `Scanner`.

You also learned that:

- `nextLine()` reads text.
- `nextInt()` reads whole numbers.
- `nextDouble()` reads decimal numbers.
- The program can use entered data to show information and make decisions.

In the next lesson, you will learn how to group this data inside a class and start working with object-oriented programming.
