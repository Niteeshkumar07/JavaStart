import java.util.InputMismatchException;
import java.util.Scanner;

class Numbers {
    private final int first;
    private final int second;

    Numbers(int first, int second) {
        this.first = first;
        this.second = second;
    }

    int getFirstNumber() {
        return first;
    }

    int getSecondNumber() {
        return second;
    }
}

class Operation {
    private final Numbers numbers;

    Operation(Numbers numbers) {
        this.numbers = numbers;
    }

    int compute(char opr) {
        int a = numbers.getFirstNumber();
        int b = numbers.getSecondNumber();

        switch (opr) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            case '%':
                if (b == 0) {
                    throw new ArithmeticException("Cannot perform modulo by zero");
                }
                return a % b;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + opr);
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the operation you want to perform (+ - * / %)");
            char opr = sc.next().charAt(0);

            System.out.println("Enter first number");
            int firstNumber = sc.nextInt();

            System.out.println("Enter second number");
            int secondNumber = sc.nextInt();

            Numbers numbersObj = new Numbers(firstNumber, secondNumber);
            Operation operationObj = new Operation(numbersObj);

            int output = operationObj.compute(opr);
            System.out.println("Result: " + output);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter a valid integer.");
        }
    }

}