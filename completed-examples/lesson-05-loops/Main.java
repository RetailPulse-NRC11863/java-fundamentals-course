// Lesson 5: Loops
// Completed example.

public class Main {
    public static void main(String[] args) {
        System.out.println("Student list:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Student number " + i);
        }

        System.out.println("Countdown:");

        int counter = 3;

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Start learning!");
    }
}

