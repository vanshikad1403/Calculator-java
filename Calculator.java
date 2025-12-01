import java.util.Scanner;

class Calculator {

    // Overloaded add methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide method with exception handling
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Cannot divide by zero!");
        }
        return (double) a / b;
    }
}

class UserInterface {

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    // Perform addition
    public void performAddition() {
        System.out.println("\nChoose Addition Type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first integer: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b1 = sc.nextInt();
                System.out.println("Result: " + calc.add(a1, b1));
                break;

            case 2:
                System.out.print("Enter first double: ");
                double a2 = sc.nextDouble();
                System.out.print("Enter second double: ");
                double b2 = sc.nextDouble();
                System.out.println("Result: " + calc.add(a2, b2));
                break;

            case 3:
                System.out.print("Enter first integer: ");
                int a3 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b3 = sc.nextInt();
                System.out.print("Enter third integer: ");
                int c3 = sc.nextInt();
                System.out.println("Result: " + calc.add(a3, b3, c3));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    // Perform subtraction
    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    // Perform multiplication
    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    // Perform division
    public void performDivision() {
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        try {
            System.out.println("Result: " + calc.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n=== Welcome to the Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using the Calculator!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice != 5);
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
