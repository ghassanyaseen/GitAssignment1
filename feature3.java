import java.util.Scanner;

public class feature1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumber(scanner, "Enter first number: ");
        char operator = getOperator(scanner);
        double num2 = getNumber(scanner, "Enter second number: ");

        double result = calculate(num1, num2, operator);
        if (!Double.isNaN(result)) {
            System.out.printf("The result is: %.2f\n", result);
        }
    }

    private static double getNumber(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static char getOperator(Scanner scanner) {
        System.out.println("Enter an operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    private static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '%':
                return dividee(num1, num2);
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    private static double dividee(double num1, double num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        }
    }
}