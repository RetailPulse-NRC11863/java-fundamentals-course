# Script - Lesson 2: Variables and data types

## Goal

In this lesson, the student will learn to save basic data of a student using variables.

## What students will learn

- A variable is like a box with a name.
- `String` saves text.
- `int` saves integer numbers.
- `double` saves decimal numbers.
- `boolean` saves true or false.
- Variables help save information that can be used later.

## What should NOT be explained

- Do not explain memory.
- Do not explain all data types.
- Do not explain objects yet.
- Do not explain arrays yet.

## Starter file

`starter-files/lesson-02-variables/Main.java`

```java
// Lesson 2: Variables and data types
// Complete the TODOs to store information about a student.

public class Main {
    public static void main(String[] args) {
        // TODO 1: Create a String variable called studentName

        // TODO 2: Create an int variable called age

        // TODO 3: Create a double variable called average

        // TODO 4: Create a boolean variable called isActive

        // TODO 5: Print each variable with a clear message
    }
}
```

## Completed example

`completed-examples/lesson-02-variables/Main.java`

```java
// Lesson 2: Variables and data types
// Completed example.

public class Main {
    public static void main(String[] args) {
        String studentName = "Ana";
        int age = 15;
        double average = 17.5;
        boolean isActive = true;

        System.out.println("Student name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Average: " + average);
        System.out.println("Active student: " + isActive);
    }
}
```

## Recording script

### Introduction

Hello! Welcome to lesson 2 of the Java course.
In this lesson, we are going to make our program remember information.
So far, we have only printed text directly to the console. Now, we will learn how to save basic data of a student using variables.

### What variables are

Think of a variable as a box with a name attached to it. Variables help us save information that we can use later.
There are different types of "boxes" in Java: `String` saves text, `int` saves whole numbers without decimals, `double` saves numbers with decimals, and `boolean` saves something that can only be true or false.

### Create a String variable

First, we are going to save the student's name.
Write:

```java
String studentName = "Ana";
```

We tell Java that we will save text using the word String with a capital 'S'. We name the variable studentName, use the equals sign to assign the value "Ana" in quotes, and close with a semicolon.

### Create int and double variables

Now, we save the age.
Write:

```java
int age = 15;
```

We use int because age is a whole number.
Now, we save the average.
Write:

```java
double average = 17.5;
```

We use double because the average has decimals.

### Create a boolean variable

Now, we need to know if the student is active.
Write:

```java
boolean isActive = true;
```

We use boolean because this can only be true or false.

### Show the information

Now that we have the data, we use `System.out.println()` to see what we saved.
Write:

```java
System.out.println("Student name: " + studentName);
System.out.println("Age: " + age);
System.out.println("Average: " + average);
System.out.println("Active student: " + isActive);
```

That plus sign allows us to combine or glue our text message with the value saved inside our variable.

### First test

Now, run the program.
Expected result:

```text
Student name: Ana
Age: 15
Average: 17.5
Active student: true
```

### Mini challenge

Now it is your turn. Your challenge is to change this data to another invented student's data.
Change the name, age, average, and activity status. For example, use the name Luis, 16 years old, 14.0 average, and status false.
Pause the video, make the changes in your editor, and run it!
Since you changed the values, the console should show your student's new data.

### Closing

Excellent job! In this lesson, you learned how to save data using variables.
You also learned that:
- `String` is for text.
- `int` is for whole numbers.
- `double` is for numbers with decimals.
- `boolean` is for true or false.

In the next lesson, you will learn how to use numbers and operators to calculate averages. Keep it up!