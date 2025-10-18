public class if_else {
    public static void main(String[] args) {
        // These conditional statements (if-else) allow your program to execute certain
        // blocks of code only if specific conditions are true.

        // if Statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You're eligible to vote."); // Executes a block if the condition is true.
        }

        // if-else Statement
        age = 17;
        if (age >= 18) {
            System.out.println("You're eligible to vote.");
        } else {
            System.out.println("You're not eligible to vote."); // Executes one block if the condition is true, and
                                                                // another if it’s false.
        }

        // else-if Ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B"); // Used when there are multiple conditions.
        } else if (marks >= 60) {
            System.out.println("Grade C"); // Used when there are multiple conditions.
        } else {
            System.out.println("Fail");
        }

        // switch Statement
        int day = 03; // Used when you want to compare a single variable against multiple possible
                      // values.
        switch (day) {
            case 01:
                System.out.println("Monday");
                break;

            case 02:
                System.out.println("Tuesday");
                break;

            case 03:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid entry"); // the default keyword specifies a block of code that will be
                                                     // executed if none of the case values match the value of the
                                                     // switch expression.
                break;
        }
    }
}