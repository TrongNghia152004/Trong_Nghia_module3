public class Calculator {

    public static double calculate(double n1, String operator, double n2) {
        switch (operator) {
            case "Addition":
                return n1 + n2;
            case "Subtraction":
                return n1 - n2;
            case "Multiplication":
                return n1 * n2;
            case "Division":
                if (n2 == 0) {
                    throw new NumberFormatException();
                } else {
                    return n1 / n2;
                }
            default:
                return 0;
        }
    }

}
