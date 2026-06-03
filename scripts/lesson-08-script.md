# Script - Lesson 8: Classes, objects and constructors

## Goal

In this lesson, students will learn the basic idea of object-oriented programming by creating a simple `Student` class.

The program will define student attributes, create a constructor, create a method, and then build student objects from the class.

## What students will learn

- A class is like a mold.
- An object is something created from that mold.
- Attributes store data.
- Methods represent actions.
- A constructor creates an object with initial data.
- `this` refers to the current object.

## What should NOT be explained

- Do not explain inheritance.
- Do not explain polymorphism.
- Do not explain interfaces.
- Do not say object-oriented programming is difficult.
- Do not explain design patterns.

## Starter file

`starter-files/lesson-08-classes-objects/Main.java`

```java
// Lesson 8: Classes, objects and constructors
// Complete the TODOs to create your first Student class.

class Student {
    // TODO 1: Create attributes:
    // String name
    // int age
    // double average

    // TODO 2: Create a constructor that receives name, age and average.

    // TODO 3: Create a method called showInfo that prints the student information.

}

public class Main {
    public static void main(String[] args) {
        // TODO 4: Create a Student object with name, age and average.

        // TODO 5: Call showInfo().

    }
}
```

## Completed example

`completed-examples/lesson-08-classes-objects/Main.java`

```java
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
```

## Recording script

### Introduction

Hello, welcome to lesson 8 of the Java course.

In the previous lesson, we learned how to read data from the console using `Scanner`.

Now we will learn one of the most important ideas in Java: the basics of object-oriented programming.

We will keep it simple by using an example of a student.

### What is a class and what is an object?

A class is like a mold.

For example, if we want to represent students, we can create a mold called `Student`.

That mold defines what information each student has and what actions each student can do.

An object is something created from that mold.

For example, Ana and Luis can both be student objects. They come from the same `Student` class, but each one has different data.

### Initial code

On the screen, we already have a class called `Student`.

```java
class Student {

}
```

Here, we will define what a student looks like in our program.

We also have the `Main` class, where we will create objects and run the program.

### Create attributes

First, we create attributes.

Attributes are the data that each object will have.

Write:

```java
String name;
int age;
double average;
```

`name` stores the student's name.

`age` stores the student's age.

`average` stores the student's average.

### Create the constructor

Now we create the constructor.

A constructor lets us create an object with initial data.

Write:

```java
Student(String name, int age, double average) {
    this.name = name;
    this.age = age;
    this.average = average;
}
```

This constructor receives the name, age and average.

Then we use `this` to store those values inside the current object.

For example, `this.name = name` means: the name of this object will be the name received by the constructor.

### Create showInfo

Now we create a method called `showInfo`.

This method will print the student's information.

Write:

```java
void showInfo() {
    System.out.println("--- Student information ---");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Average: " + average);
}
```

This method does not return anything, so we use `void`.

It only prints the information of the student.

### Create the first object

Now go to the `main` method.

We will create our first `Student` object.

Write:

```java
Student student1 = new Student("Ana", 15, 17.5);
```

Here we create an object called `student1`.

We use `new Student` because we want to create a new student.

The values inside the parentheses are sent to the constructor.

Now call `showInfo`.

Write:

```java
student1.showInfo();
```

This asks `student1` to show its information.

### Create the second object

Now we create another student.

Write:

```java
Student student2 = new Student("Luis", 16, 12.8);
student2.showInfo();
```

Now we have another object from the same `Student` class, but with different data.

This is the key idea: one class can create many objects.

### Run the program

Now run the program.

You should see Ana's information first and Luis's information after that.

Expected result:

```text
--- Student information ---
Name: Ana
Age: 15
Average: 17.5
--- Student information ---
Name: Luis
Age: 16
Average: 12.8
```

### Mini challenge

Now pause the video and try creating a third student.

For example:

```java
Student student3 = new Student("Maria", 15, 18.2);
student3.showInfo();
```

You can change the name, age and average.

### Closing

In this lesson, you learned the basic idea of object-oriented programming.

A class is like a mold.

An object is something created from that mold.

Attributes store data.

Methods represent actions.

And a constructor lets us create objects with initial data.

In the next lesson, you will learn how to protect data using encapsulation, getters and setters.