public class operators {
    public static void main(String[] args) {
        // Comparison Operators

        int number = 10;
        // Equal to
        if (number == 20) {
            System.out.println("Both the values are equal");
        }
        // Not Equal to
        if (number != 20) {
            System.out.println("Print this line if the numbers are not equal");
        }
        // Greater than
        if (number > 20) {
            System.out.println("Print this line if number is greater than 20");
        }
        // Lesser than
        if (number < 20) {
            System.out.println("Print this line if the number is lesser than 20");
        }
        // Greater than or equal to(>=) and less than or equal(<=) to are explained in
        // the previous section.

        // Logical Operators

        int age = 25;
        // Logical AND -> true if both conditions are true.
        if (age < 18) {
            System.out.println("Ticket price is 15$");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Ticket price is 20$");
        }
        // Logical OR -> true if any one of the condition is true.
        int x = 10, y = 20;
        if (x > 10 || y > 10) {
            System.out.println("One of the condition is true.");
        }
        // Logical NOT -> Reverses the logical state of the operand.
        boolean a = true;
        System.out.println(!a);
    }
}

