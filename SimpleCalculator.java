import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result = 0;
        boolean valid = true;

        switch (choice) {
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> {
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Cannot divide by zero!");
                    valid = false;
                }
            }
            default -> {
                System.out.println("Invalid choice!");
                valid = false;
            }
        }

        if (valid)
            System.out.println("\nResult: " + result);

        sc.close();
    }
}
