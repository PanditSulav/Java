import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;
        char choice;


        do {
            // Get first number
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            // Get operator
            System.out.print("Enter operator (+, -, *, /, %): ");
            operator = scanner.next();

            // Get second number
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Perform calculation
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println(num1 + " % " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Modulo by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, /, or %.");
            }

            // Ask to continue
            System.out.print("Do another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'N');

        System.out.println("Thanks for using the calculator!");
        scanner.close();
    }
}