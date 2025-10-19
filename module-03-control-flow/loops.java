import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // Looping statements(iteration)

        // for loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("Count: " + i); // Used when you know how many times you want to repeat.
        }
        // while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i); // Used when the number of repetitions is unknown, and depends on a
                                               // condition.
            i++;
        }
        // do-while loop
        Scanner scanner = new Scanner(System.in);
        int number;
        // Similar to while, but executes at least once even if the condition is false.
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0); // Loop continues as long as the number is NOT positive

        System.out.println("You entered the positive number: " + number);
        scanner.close();

        // Jump statements

        // break
        for (i = 0; i<=10; i++) {
            System.out.println("Count: " + i);
            if (i == 5) {
                break; // Stops the loop immediately.
            }
        }
        // continue
        for (i = 0; i<=10; i++) {
            System.out.println(i);
            if (i == 3) {
                continue; // Skips the current iteration and goes to the next one.
            }
        }
    }
}
