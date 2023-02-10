public class Calculator {

    public static double calculate(double n1, String operator , double n2) {
        switch (operator) {
            case "Cong":
                return n1 + n2;
            case "Tru":
                return n1-n2;
            case "Nhan":
                return n1*n2;
            case "Chia":
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
