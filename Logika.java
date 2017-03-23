package calc;

public class Logika {

    public static double policz(double arg1, double arg2, String operacja) {

        switch (operacja) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return arg1 / arg2;
            case "mod":
                return arg1 % arg2;
            default:
                return 0;
        }

    }
}
