public class Calculator {

    public static double calculate(double firstNumber, String operator, double secondNumber) {
        switch (operator) {
            case "Addition":
                return firstNumber + secondNumber;
            case "Subtraction":
                return firstNumber - secondNumber;
            case "Multiplication":
                return firstNumber * secondNumber;
            case "Division":
                if (secondNumber == 0) {
                    throw new NumberFormatException();
                } else {
                    return firstNumber / secondNumber;
                }
            default:
                return 0;
        }
    }

}
