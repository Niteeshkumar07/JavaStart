// NumberGroup.java
class NumberGroup {
    private final int firstNumber;
    private final int secondNumber;

    // Constructor injection ensures flexibility and immutability
    public NumberGroup(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // Encapsulation via getter methods
    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }
}

// CalculatorService.java
class CalculatorService {
    
    // Separation of concerns: logic is kept separate from data storage
    public int computeSum(NumberGroup numbers) {
        return numbers.getFirstNumber() + numbers.getSecondNumber();
    }
}

// Application.java
public class MainApplication {
    public static void main(String[] args) {
        NumberGroup numbers = new NumberGroup(20, 30);
        CalculatorService calculator = new CalculatorService();

        int totalSum = calculator.computeSum(numbers);
        System.out.println("Sum: " + totalSum);
    }
}