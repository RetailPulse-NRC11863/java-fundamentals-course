# Script - Lesson 1: Introduction to Java

## Goal

In this lesson, the student will understand what programming is and run their first program in Java.

## What students will learn

- Programming is giving instructions to a computer.
- Java is a language used to create programs.
- A program executes instructions step by step.
- `System.out.println()` is used to show messages in the console.
- Nothing will be installed; an online editor will be used.

## What should NOT be explained

- Do not explain JVM.
- Do not explain JDK.
- Do not explain compilers.
- Do not explain the long history of Java.
- Do not explain object-oriented programming yet.

## Starter file

`starter-files/lesson-01-introduction/Main.java`

```java
// Lesson 1: Introduction to Java
// Complete the TODOs to print your first messages in Java.

public class Main {
    public static void main(String[] args) {
        // TODO 1: Print "Hello, world!"

        // TODO 2: Print your name with the message "My name is:.."

        // TODO 3: Print "I am learning Java"
    }
}
```

## Completed example

`completed-examples/lesson-01-introduction/Main.java`

```java
// Lesson 1: Introduction to Java
// Completed example.

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        
        System.out.println("My name is: Ana");
        
        System.out.println("I am learning Java");
    }
}
```

## Recording script

### Introduction

Hello, welcome to lesson 1 of the Java course.

In this lesson, we are going to learn what programming is.

We are going to make the computer greet us using Java.

By the end of this video, you will have your first program running on the screen.

### What programming and Java are

Programming is simply giving instructions to a computer so it does what we want.

Java is the language we will use to write those instructions.

A program reads and executes these instructions step by step.

The best part is that we will not install anything on your computer; we will use an online editor directly in the web browser.

### Initial code

On the screen, we already have the starter file.

We are going to use a key instruction to show messages in the console.

Write:

```java
System.out.println("Hello, world!");
```

We write System with a capital 'S', a dot, out, another dot, and the word println, which means 'print line'.

We open parentheses, put double quotes, and write our text inside. We always finish the line with a semicolon.

### Adding more messages

Now, let's add two more messages.

Write:

```java
System.out.println("My name is: Ana");
System.out.println("I am learning Java");
```

Now, click the run button.

We can see how the computer reads our instructions and shows the texts in the console.

### First test

Now, run the program.

Expected result:

```text
Hello, world!
My name is: Ana
I am learning Java
```

### Mini challenge

Now, try another example.

Your first mini challenge is to change the name "Ana" in the code to your own name.

Because you changed the name, the program should show your name on the screen.

Pause the video, make the change in your editor, and run it!

### Closing

In this lesson, you learned what programming is and how to show messages in the console.

You also learned that:

- Java is a language used to create programs.
- `System.out.println()` prints text on the screen.
- Every instruction ends with a semicolon.

In the next lesson, you will learn how to save data using variables.