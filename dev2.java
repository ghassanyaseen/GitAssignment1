import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumber(scanner, "Enter first number: ");
        char operator = getOperator(scanner);
        double num2 = getNumber(scanner, "Enter second number: ");

        double result = calculate(num1, num2, operator);
        if (!Double.isNaN(result)) {
            System.out.printf("The result is: %.2f\n", result);
        }

        System.out.println("All Done");
        System.out.println("have a nice day");
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
        }
    }
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }
}

